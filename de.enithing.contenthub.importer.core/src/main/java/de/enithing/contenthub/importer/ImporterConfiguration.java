package de.enithing.contenthub.importer;

import de.enithing.contenthub.importer.contentfragment.ContentFragmentFieldImporterRegistry;
import de.enithing.contenthub.importer.contentfragment.DefaultContentFragmentFieldImporterFactory;
import org.apache.commons.vfs2.FileObject;
import org.jdom2.Element;

public class ImporterConfiguration {
    public ImporterConfiguration()  {
        this(new DefaultContentFragmentFieldImporterFactory());
    }

    public ImporterConfiguration(ContentFragmentFieldImporterRegistry fieldImporterRegistry) {
        this.fieldImporterRegistry = fieldImporterRegistry;
    }

    public enum UnknownFieldHandlingMode {
        Error,
        Ignore,
    }

    public FileObject targetFile;
    public FileObject sourceFile;
    public String modelSetName = "Default model set";
    public Element node;
    public UnknownFieldHandlingMode unknownFieldHandling;

    final private ContentFragmentFieldImporterRegistry fieldImporterRegistry;

    public ContentFragmentFieldImporterRegistry getFieldImporterRegistry() {
        return fieldImporterRegistry;
    }

    @Override
    protected ImporterConfiguration clone() {
        ImporterConfiguration cfg = new ImporterConfiguration(fieldImporterRegistry);
        cfg.sourceFile = sourceFile;
        cfg.targetFile = targetFile;
        cfg.unknownFieldHandling = unknownFieldHandling;
        return cfg;
    }
}
