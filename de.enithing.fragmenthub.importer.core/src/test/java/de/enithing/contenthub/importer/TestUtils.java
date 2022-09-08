package de.enithing.contenthub.importer;

import java.nio.file.Path;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;
import org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider;
import org.apache.commons.vfs2.provider.ram.RamFileProvider;

public class TestUtils {
	public static class TestConfig {
		public FileSystemManager vfsManager;
		public String vfsRoot;
	}

	public static TestConfig createInMemoryVFSManager() throws FileSystemException {
		TestConfig cfg = new TestConfig();
		cfg.vfsRoot = "ram://virtual";

		DefaultFileSystemManager manager = new DefaultFileSystemManager();
		manager.addProvider("ram", new RamFileProvider());
		manager.init();
		manager.createVirtualFileSystem(cfg.vfsRoot);

		cfg.vfsManager = manager;
		return cfg;
	}
	
	public static TestConfig createFileVFSManager(Path root) throws FileSystemException {
		TestConfig cfg = new TestConfig();
		cfg.vfsRoot = "file://" + root.toString();
		
		DefaultFileSystemManager manager = new DefaultFileSystemManager();
		manager.addProvider("file", new DefaultLocalFileProvider());
		manager.init();
		manager.createVirtualFileSystem(cfg.vfsRoot);
		
		cfg.vfsManager = manager;
		return cfg;
	}
}
