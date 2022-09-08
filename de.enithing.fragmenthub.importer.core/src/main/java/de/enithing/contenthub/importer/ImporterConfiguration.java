package de.enithing.contenthub.importer;

import de.enithing.contenthub.importer.contentfragment.ContentFragmentFieldImporterRegistry;
import de.enithing.contenthub.importer.contentfragment.DefaultContentFragmentFieldImporterFactory;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.Package;

import org.apache.commons.vfs2.FileObject;
import org.jdom2.Element;

public class ImporterConfiguration {

    public ContentFragmentFieldType<?> currentField;

    public ImporterConfiguration()  {
        this(new DefaultContentFragmentFieldImporterFactory());
    }

    public ImporterConfiguration(ContentFragmentFieldImporterRegistry fieldImporterRegistry) {
        this.fieldImporterRegistry = fieldImporterRegistry;
    }

    public Context context;

    public enum UnknownFieldHandlingMode {
        Error,
        Ignore,
    }

    public enum ReferenceResolutionMode {
        Exact,
        MatchInPackage,
    }

    public boolean importContent = true;

    public FileObject targetFile;
    public FileObject sourceFile;
    public String modelSetName = "Default model set";

    public Package currentPackage;
    public Element currentNode;

    public UnknownFieldHandlingMode unknownFieldHandling = UnknownFieldHandlingMode.Error;
    public ReferenceResolutionMode fragmentModelResolution = ReferenceResolutionMode.MatchInPackage;
    public ReferenceResolutionMode fragmentReferenceResolution = ReferenceResolutionMode.MatchInPackage;

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
        cfg.fragmentModelResolution = fragmentModelResolution;
        cfg.currentNode = currentNode;
        cfg.currentPackage = currentPackage;
        cfg.currentField = currentField;
        return cfg;
    }
}
