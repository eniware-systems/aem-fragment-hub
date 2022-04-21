package de.enithing.contenthub.generator.cli;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.contenthub.generator.GeneratorUtils;
import de.enithing.contenthub.generator.PackageGenerator;
import de.enithing.contenthub.model.contenthub.Package;

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
    private static String getBanner() {

        return "ContentHub Generator 0.1a";
    }

    private static Option getHelpOption() {
        return new Option("h", "help", false, "print this message");
    }

    private static Options getOptions() {
        Options opts = new Options();

        Option opt;

        opts.addOption(getHelpOption());

        opt = new Option("i", "input", true, "The .cfcore model to generate from");
        opt.setRequired(true);
        opt.setArgName("INPUT");
        opts.addOption(opt);

        opt = new Option("o", "output", true, "The directory to put the generated results to");
        opt.setRequired(true);
        opt.setArgName("OUTPUT");
        opts.addOption(opt);

        opt = new Option("s", "dry-run", false, "Don't modify anything on disk, just simulate the generation.");
        opts.addOption(opt);
        
        opt = new Option("f", "ignore-unknown-fields", false, "Ignore fields that cannot be generated.");
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
            formatter.printHelp("cf-generate", getOptions(), true);
            System.out.println();
            return;
        }

        final String rootPath = Path.of(params.getOptionValue('o')).toAbsolutePath().toString();
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
        } catch (FileSystemException e) {
            e.printStackTrace();
            System.err.println("Generation failed");
            return;
        }

        // Todo: Add config options here
        cfg.unknownFieldHandling = UnknownFieldHandlingMode.Error;
        if(params.hasOption("f")) {
        	cfg.unknownFieldHandling = UnknownFieldHandlingMode.Ignore;
        }
        
        GeneratorUtils.initFactories();
        PackageGenerator gen = new PackageGenerator(cfg); 

        Package pkg = GeneratorUtils.loadPackageFromUri(URI.createURI(params.getOptionValue('i')));
        
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
