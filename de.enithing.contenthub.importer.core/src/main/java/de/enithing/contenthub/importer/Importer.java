package de.enithing.contenthub.importer;

import java.util.logging.Logger;

public interface Importer<T> {
    public ImporterConfiguration getConfig();

    default public ImporterConfiguration createChildConfig(T element) {
        ImporterConfiguration cfg = getConfig().clone();
        return cfg;
    }

    public T createElement() throws Exception;

    public void onEnter(T element) throws Exception;

    public void onExit(T element) throws Exception;

    public Logger getLogger();

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
