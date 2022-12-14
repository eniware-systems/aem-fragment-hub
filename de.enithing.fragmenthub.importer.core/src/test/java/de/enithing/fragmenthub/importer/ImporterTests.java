package de.enithing.fragmenthub.importer;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.TestUtils.TestConfig;
import de.enithing.fragmenthub.importer.pkg.PackageImporter;
import de.enithing.fragmenthub.model.fragmenthub.Package;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

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
    @Disabled
    public void importTest() throws Exception {
        PackageImporter importer = createPackageImporter();
        Package pkg = importer.doImport();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("chub", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI("/tmp/foo.chub"));
        resource.getContents().add(pkg);
        resource.save(Collections.EMPTY_MAP);
    }
}
