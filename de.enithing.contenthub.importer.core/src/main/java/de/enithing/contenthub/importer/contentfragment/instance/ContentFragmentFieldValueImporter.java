package de.enithing.contenthub.importer.contentfragment.instance;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;

import java.util.logging.Logger;

public abstract class ContentFragmentFieldValueImporter<TValue extends ContentFragmentFieldValue> implements Importer<TValue> {
    private final ImporterConfiguration config;

    public ContentFragmentFieldValueImporter(ImporterConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public ImporterConfiguration getConfig() {
        return config;
    }

    @Override
    public void onEnter(TValue value) throws Exception {

    }

    @Override
    public void onExit(TValue value) throws Exception {

    }

    private final Logger logger = Logger.getLogger(getClass().getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }
}
