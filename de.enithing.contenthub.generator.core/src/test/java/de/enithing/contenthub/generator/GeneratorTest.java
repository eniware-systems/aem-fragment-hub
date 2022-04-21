package de.enithing.contenthub.generator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;
import org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider;
import org.apache.commons.vfs2.provider.ram.RamFileProvider;
import org.junit.jupiter.api.Test;
import de.enithing.contenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.RootContext;

class GeneratorTest {
	public static String VFSRootPath;

	public static FileSystemManager createInMemoryVFSManager() throws FileSystemException {
		VFSRootPath = "ram://virtual";
		
		DefaultFileSystemManager manager = new DefaultFileSystemManager();
		manager.addProvider("ram", new RamFileProvider());
		manager.init();
		manager.createVirtualFileSystem(VFSRootPath);
		return manager;
	}
	
	public static FileSystemManager createFileVFSManager(Path root) throws FileSystemException {
		VFSRootPath = "file://" + root.toString();
		
		DefaultFileSystemManager manager = new DefaultFileSystemManager();
		manager.addProvider("file", new DefaultLocalFileProvider());
		manager.init();
		manager.createVirtualFileSystem(VFSRootPath);
		return manager;
	}

	@Test
	void test() throws FileSystemException {
		ContentHubFactory hubFactory = ContentHubFactory.eINSTANCE;
		ContentFragmentFactory cfFactory = ContentFragmentFactory.eINSTANCE;
		CorefieldsFactory fieldsFactory = CorefieldsFactory.eINSTANCE;

		Package myPackage = hubFactory.createPackage();
		
		myPackage.createDefaultPackageStructure();
		
		myPackage.setGroup("de.enithing.contenthub");
		myPackage.setName("bookstore");
		myPackage.setVersion("1.0.0");
		myPackage.setAuthor("J.R. Baboon");
		myPackage.setDescription("A book store package");
		
		RootContext modelContext = hubFactory.createRootContext();
		modelContext.setTitle("Model context");
		modelContext.setRelativePath(Path.of("/conf/$packageName/settings/dam/cfm/models"));
		myPackage.getContexts().add(modelContext);

		ContentFragmentModel bookModel = cfFactory.createContentFragmentModel();
		bookModel.setId("book");
		bookModel.setTitle("book");
		bookModel.setDescription("A book as part of the library");
		bookModel.setContext(modelContext);
				
		{
			DateTime field = fieldsFactory.createDateTime();
			field.setPropertyName("added_date");
			field.setFieldLabel("added date");
			field.setDescription("the date the book was added to the library");
			field.setDefaultValue(Date.from(Instant.now()));

			field.setRequired(true);

			bookModel.getFields().add(field);
		}

		{
			SingleLineText field = fieldsFactory.createSingleLineText();
			field.setPropertyName("title");
			field.setFieldLabel("book title");
			field.setDescription("the title of the book");

			field.setRequired(true);

			bookModel.getFields().add(field);
		}

		{
			SingleLineText field = fieldsFactory.createSingleLineText();
			field.setPropertyName("author");
			field.setFieldLabel("book author");
			field.setDescription("the author of the book");

			field.setRequired(true);

			bookModel.getFields().add(field);
		}
		
		{
			Tab tab = fieldsFactory.createTab();
			tab.setPropertyName("tab_info");
			tab.setFieldLabel("info");
			tab.setDescription("additional information");;

			bookModel.getFields().add(tab);
			
			{
				MultiLineText field = fieldsFactory.createMultiLineText();
				field.setPropertyName("abstract");
				field.setFieldLabel("abstract");
				field.setDescription("the abstract of the book");

				bookModel.getFields().add(field);
			}
			
			{
				MultiLineText field = fieldsFactory.createMultiLineText();
				field.setPropertyName("examples");
				field.setFieldLabel("examples");
				field.setDescription("reading examples of the book");
				field.setAllowMultiple(true);

				bookModel.getFields().add(field);
			}
		}

		ContentFragmentModel libraryModel = cfFactory.createContentFragmentModel();
		libraryModel.setId("library");
		libraryModel.setTitle("library");
		libraryModel.setDescription("A library");
		libraryModel.setContext(modelContext);

		{
			FragmentReference field = fieldsFactory.createFragmentReference();
			field.setPropertyName("books");
			field.setFieldLabel("books");
			field.setDescription("the books of the library");
			field.setAllowFragmentCreation(false);
			field.setAllowMultiple(true);
			field.getAllowedModels().add(bookModel);

			bookModel.getFields().add(field);
		}

		RootContext contentContext = hubFactory.createRootContext();
		contentContext.setTitle("Content context");
		contentContext.setRelativePath(Path.of("/content/dam/$packageName"));
		myPackage.getContexts().add(modelContext);

		ChildContext booksContext = hubFactory.createChildContext();
		booksContext.setTitle("All the books");
		booksContext.setParentContext(contentContext);
		booksContext.setRelativePath(Path.of("/books"));

		AllowedContentFragmentModelPolicy onlyBooksPolicy = cfFactory.createAllowedContentFragmentModelPolicy();
		onlyBooksPolicy.getModels().add(bookModel);
		booksContext.getPolicies().add(onlyBooksPolicy);

		ContentFragmentInstance book = cfFactory.createContentFragmentInstance();
		book.setModel(bookModel);

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFields().get(0));

			DateTimeValue value = fieldsFactory.createDateTimeValue();
			value.setValue(Date.from(Instant.now()));

			field.setValue(value);
			book.getFields().add(field);
		}

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFields().get(1));

			StringValue value = fieldsFactory.createStringValue();
			value.setValue("The Necronomicon");

			field.setValue(value);
			book.getFields().add(field);
		}

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFields().get(2));

			StringValue value = fieldsFactory.createStringValue();
			value.setValue("Abdul Alhazred");

			field.setValue(value);
			book.getFields().add(field);
		}

		book.setContext(booksContext);

		ContentFragmentInstance library = cfFactory.createContentFragmentInstance();
		library.setModel(libraryModel);
		library.setId("great_lib");
		library.setTitle("Great Library of Alexandria");
		library.setDescription("This library contains all the wisdom of the old ages");

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFields().get(2));

			FragmentReferenceValue value = fieldsFactory.createFragmentReferenceValue();
			value.getFragments().add(book);

			field.setValue(value);
			library.getFields().add(field);
		}

		library.setContext(contentContext);

		GeneratorConfiguration cfg = new GeneratorConfiguration();
		cfg.unknownFieldHandling = UnknownFieldHandlingMode.Error;
				
		//FileSystemManager vfs = createInMemoryVFSManager();
		FileSystemManager vfs = createFileVFSManager(Path.of("/tmp/foonbar"));
		
		cfg.targetRoot = vfs.resolveFile(VFSRootPath);

		if (cfg.targetRoot.exists()) {
			cfg.targetRoot.deleteAll();
		}
		cfg.targetRoot.createFolder();

		PackageGenerator gen = new PackageGenerator(cfg);
		
		assertDoesNotThrow(() -> gen.generate(myPackage));		
	}

}
