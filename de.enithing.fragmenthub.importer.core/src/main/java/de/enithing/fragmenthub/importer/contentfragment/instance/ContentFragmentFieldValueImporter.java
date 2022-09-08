package de.enithing.fragmenthub.importer.contentfragment.instance;

import de.enithing.fragmenthub.importer.Importer;
import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;

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

    public void onPostImportPackage(ContentFragmentFieldInstance fieldInstance) throws Exception {
    }
}
