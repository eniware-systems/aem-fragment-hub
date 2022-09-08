package de.enithing.contenthub.importer;

import java.util.logging.Logger;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;

public interface Importer<T> {
    ImporterConfiguration getConfig();

    default ImporterConfiguration createChildConfig(T element) {
        ImporterConfiguration cfg = getConfig().clone();
        return cfg;
    }

    T createElement() throws Exception;

    void onEnter(T element) throws Exception;

    void onExit(T element) throws Exception;

    Logger getLogger();

    default T doImport() throws Exception {
        T element = createElement();

        Logger logger = getLogger();

        try {
            // logger.info(String.format("Generating %s ...", ModelPrinter.toString(element)));
            onEnter(element);
            onExit(element);
            // logger.fine(String.format("Generated %s ...", ModelPrinter.toString(element)));
        } catch (Exception e) {
            //logger.severe(String.format("Generation of %s failed: %s", ModelPrinter.toString(element), e.getMessage()));
            throw e;
        }

        return element;
    }
}
