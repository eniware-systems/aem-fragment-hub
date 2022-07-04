package de.enithing.contenthub.importer;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import de.enithing.contenthub.importer.pkg.PackageImporter;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.junit.jupiter.api.BeforeEach;
import de.enithing.contenthub.importer.TestUtils.TestConfig;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

class ImporterTests {
    private FileSystemManager vfsManager;
    private String vfsRoot;

    @BeforeEach
    void setupVfs() throws FileSystemException {
        TestConfig cfg = TestUtils.createFileVFSManager(Path.of("/"));
        // TestConfig cfg = TestUtils.createFileVFSManager(Path.of("/tmp/foo"));
        vfsManager = cfg.vfsManager;
        vfsRoot = cfg.vfsRoot;
    }

    private PackageImporter createPackageImporter() throws FileSystemException {
        ImporterConfiguration cfg = new ImporterConfiguration();

        cfg.sourceFile = vfsManager.resolveFile("file:///home/mvonkeil/Projects/AIDA/test-repo");
        cfg.targetFile = vfsManager.resolveFile("file:///tmp/out.chub");

        return new PackageImporter(cfg);
    }

    @Test
    public void importTest() throws Exception {
        PackageImporter importer = createPackageImporter();


        importer.doImport();
    }

}
