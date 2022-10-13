package de.enithing.fragmenthub.generator.cli;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.fragmenthub.generator.GeneratorUtils;
import de.enithing.fragmenthub.generator.pkg.PackageGenerator;
import de.enithing.fragmenthub.model.fragmenthub.Package;

import org.apache.commons.cli.*;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;
import org.apache.commons.vfs2.provider.FileProvider;
import org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider;
import org.apache.commons.vfs2.provider.ram.RamFileProvider;
import org.eclipse.emf.common.util.URI;

import java.nio.file.Path;
import java.util.logging.Logger;

public class Main {
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%4$-7s] %5$s %n");
    }

    private static String getBanner() {

        return "FragmentHub Generator 0.3";
    }

    private static String getExecutableName() {
        return "afh-generate";
    }

    private static Option getHelpOption() {
        return new Option("h", "help", false, "print this message");
    }

    private static Options getOptions() {
        Options opts = new Options();

        Option opt;

        opts.addOption(getHelpOption());

        opt = new Option("s", "dry-run", false, "Don't modify anything on disk, just simulate the generation.");
        opts.addOption(opt);

        opt = new Option("i", "ignore-unknown-fields", false, "Ignore fields that cannot be generated.");
        opts.addOption(opt);

        opt = new Option("f", "force", false, "Force write into existing folders.");
        opts.addOption(opt);

        opt = new Option("S", "skip-skeleton", false, "Skip the package skeleton creation.");
        opts.addOption(opt);

        opt = new Option("r", "remove-existing", false, "Remove existing files from content and models folders before generating.");
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

    private static void printHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(getExecutableName(), getOptions(), true);
        System.out.println();
    }

    private static Path resolvePath(URI path) {
        return Path.of(path.toString().replaceFirst("^~", System.getProperty("user.home"))).toAbsolutePath();
    }

    public static void main(String[] args) {
        System.out.println(getBanner());

        CommandLine params = parseCommandLine(args);
        if (params == null) {
            System.out.println();
            return;
        }

        if (params.hasOption("h")) {
            printHelp();
            return;
        }

        if (params.getArgList().size() == 0) {
            printHelp();
            System.out.println("Missing source and target, aborting.");
            return;
        }

        if (params.getArgList().size() != 2) {
            printHelp();
            System.out.println("Missing target, aborting.");
            return;
        }

        Path sourcePath = resolvePath(URI.createURI(params.getArgList().get(0)));
        Path targetPath = resolvePath(URI.createURI(params.getArgList().get(1)));

        final String rootPath = targetPath.toString();
        String rootUri;

        DefaultFileSystemManager manager = new DefaultFileSystemManager();
        GeneratorConfiguration cfg = new GeneratorConfiguration();

        try {
            FileProvider provider;
            String scheme;

            if (params.hasOption("s")) {
                Logger.getGlobal().warning("This is just a dry run, will not change anything on disk!");
                scheme = "mem";
                provider = new RamFileProvider();
                rootUri = String.format("%s://virtual", scheme);
            } else {
                scheme = "file";
                provider = new DefaultLocalFileProvider();
                rootUri = String.format("%s://%s", scheme, rootPath);
            }

            manager.addProvider(scheme, provider);
            manager.setDefaultProvider(provider);

            manager.init();

            manager.createVirtualFileSystem(rootUri);

            cfg.targetRoot = manager.resolveFile(rootUri);

            if (cfg.targetRoot.isFile()) {
                Logger.getGlobal().severe(String.format("Target %s is not a folder", rootPath));
                System.out.println();
                return;
            }

            if (cfg.targetRoot.isFolder() && cfg.targetRoot.getChildren().length != 0) {
                if (params.hasOption('f')) {
                    Logger.getGlobal().warning(String.format("Forced to write in existing folder %s%n", rootPath));
                } else {
                    Logger.getGlobal().severe(String.format("Target folder %s is not empty%n", rootPath));
                    System.out.println();
                    return;
                }
            }

        } catch (FileSystemException e) {
            e.printStackTrace();
            System.err.println("Generation failed");
            return;
        }

        // Todo: Add config options here
        cfg.unknownFieldHandling = UnknownFieldHandlingMode.Error;
        if (params.hasOption("i")) {
            cfg.unknownFieldHandling = UnknownFieldHandlingMode.Ignore;
        }

        cfg.skipSkeletonCreation = params.hasOption("S");
        cfg.removeExistingFiles = params.hasOption("r");

        GeneratorUtils.initFactories();
        PackageGenerator gen = new PackageGenerator(cfg);

        Package pkg = GeneratorUtils.loadPackageFromUri(URI.createURI(sourcePath.toString()));

        Logger.getGlobal().info(String.format("Will generate into %s\n", rootUri));

        try {
            gen.generate(pkg);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Generation failed");
            return;
        }

        System.out.println("Generation complete");
    }
}
