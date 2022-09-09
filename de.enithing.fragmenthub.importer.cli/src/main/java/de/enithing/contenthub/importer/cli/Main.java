package de.enithing.contenthub.importer.cli;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.pkg.PackageImporter;
import de.enithing.contenthub.importer.util.ImporterUtils;
import de.enithing.contenthub.model.contenthub.Package;

import org.apache.commons.cli.*;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;
import org.apache.commons.vfs2.provider.FileProvider;
import org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider;
import org.apache.commons.vfs2.provider.ram.RamFileProvider;
import org.eclipse.emf.common.util.URI;

import java.io.OutputStream;
import java.nio.file.Path;
import java.util.logging.Logger;

public class Main {
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%4$-7s] %5$s %n");
    }

    private static String getBanner() {

        return "FragmentHub Generator 0.1a";
    }

    private static Option getHelpOption() {
        return new Option("h", "help", false, "print this message");
    }

    private static Options getOptions() {
        Options opts = new Options();

        Option opt;

        opts.addOption(getHelpOption());

        opt = new Option("i", "input", true, "The package directory to read from");
        opt.setRequired(true);
        opt.setArgName("INPUT");
        opts.addOption(opt);

        opt = new Option("o", "output", true, "The .chub model to generate to");
        opt.setRequired(true);
        opt.setArgName("OUTPUT");
        opts.addOption(opt);

        opt = new Option("s", "dry-run", false, "Don't modify anything on disk, just simulate the generation.");
        opts.addOption(opt);

        opt = new Option("f", "ignore-unknown-fields", false, "Ignore fields that cannot be generated.");
        opts.addOption(opt);

        opt = new Option("c", "no-content", false, "Skip content import (import models only).");
        opts.addOption(opt);

        return opts;
    }

    private static CommandLine parseCommandLine(String[] args) {
        CommandLineParser parser = new DefaultParser();

        Options options = new Options();
        options.addOption(getHelpOption());

        try {
            // Help has top priority even over required params
            CommandLine params = parser.parse(options, args);
            if (params.hasOption("h")) {
                return params;
            }
        } catch (ParseException ignored) {
        }

        try {
            return parser.parse(getOptions(), args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getBanner());

        CommandLine params = parseCommandLine(args);
        if (params == null) {
            System.out.println();
            return;
        }

        if (params.hasOption("h")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("cf-import", getOptions(), true);
            System.out.println();
            return;
        }

        final String sourcePath = Path.of(params.getOptionValue('i')).toAbsolutePath().toString();
        String sourceUri = String.format("file://%s", sourcePath);

        DefaultFileSystemManager manager = new DefaultFileSystemManager();
        ImporterConfiguration cfg = new ImporterConfiguration();

        if (params.hasOption("c")) {
            cfg.importContent = false;
        }

        final String targetPath = Path.of(params.getOptionValue('o')).toAbsolutePath().toString();
        String targetUri;
        String targetFileUri;

        try {
            FileProvider provider;
            String scheme;

            if (params.hasOption("s")) {
                Logger.getGlobal().warning("This is just a dry run, will not change anything on disk!");
                scheme = "mem";
                provider = new RamFileProvider();
                targetUri = String.format("%s://virtual", scheme);
            } else {
                scheme = "file";
                provider = new DefaultLocalFileProvider();
                targetUri = String.format("%s://%s", scheme, Path.of(targetPath).getParent().toString());
            }

            manager.addProvider(scheme, provider);
            manager.setDefaultProvider(provider);

            manager.init();

            targetFileUri = String.format("%s/%s", targetUri, Path.of(targetPath).getFileName().toString());

            manager.createVirtualFileSystem(targetUri);

            cfg.sourceFile = manager.resolveFile(sourceUri);
        } catch (FileSystemException e) {
            e.printStackTrace();
            System.err.println("Import failed");
            return;
        }

        // Todo: Add config options here
        cfg.unknownFieldHandling = ImporterConfiguration.UnknownFieldHandlingMode.Error;
        if (params.hasOption("f")) {
            cfg.unknownFieldHandling = ImporterConfiguration.UnknownFieldHandlingMode.Ignore;
        }

        ImporterUtils.initFactories();
        PackageImporter imp = new PackageImporter(cfg);

        Logger.getGlobal().info(String.format("Will import from %s\n", sourceUri));

        try {
            Package pkg = imp.doImport();

            if (params.hasOption("s")) {
                return;
            }

            FileObject outFile = manager.resolveFile(targetFileUri);
            if (outFile.exists()) {
                outFile.delete();
            }
            outFile.createFile();

            OutputStream os = outFile.getContent().getOutputStream();

            ImporterUtils.savePackage(pkg, os);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Import failed");
            return;
        }

        System.out.println("Import complete");
    }
}
