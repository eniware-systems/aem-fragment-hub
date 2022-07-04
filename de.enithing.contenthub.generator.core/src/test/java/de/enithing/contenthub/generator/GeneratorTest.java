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
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import de.enithing.contenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.contenthub.generator.TestUtils.TestConfig;
import de.enithing.contenthub.generator.pkg.PackageGenerator;
import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.contenthub.model.contentfragment.corefields.EnumerationOption;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.Package;

class GeneratorTest {
	private FileSystemManager vfsManager;
	private String vfsRoot;

	@BeforeEach
	void setupVfs() throws FileSystemException {
		TestConfig cfg = TestUtils.createInMemoryVFSManager();
		// TestConfig cfg = TestUtils.createFileVFSManager(Path.of("/tmp/foo"));
		vfsManager = cfg.vfsManager;
		vfsRoot = cfg.vfsRoot;
	}

	private PackageGenerator createPackageGenerator() throws FileSystemException {
		GeneratorConfiguration cfg = new GeneratorConfiguration();
		cfg.unknownFieldHandling = UnknownFieldHandlingMode.Error;

		cfg.targetRoot = vfsManager.resolveFile(vfsRoot);

		if (cfg.targetRoot.exists()) {
			cfg.targetRoot.deleteAll();
		}
		cfg.targetRoot.createFolder();

		PackageGenerator gen = new PackageGenerator(cfg);

		return gen;
	}

	
	@Test
	void resourceTest() throws FileSystemException {
		PackageGenerator gen = createPackageGenerator();

		Package myPackage = GeneratorUtils.loadPackageFromUri(URI.createURI("file:///tmp/test.chub"));

		assertDoesNotThrow(() -> gen.generate(myPackage));
	}
	

	@Test
	void bookStoreTest() throws FileSystemException {
		ContentHubFactory hubFactory = ContentHubFactory.eINSTANCE;
		ContentFragmentFactory cfFactory = ContentFragmentFactory.eINSTANCE;
		CorefieldsFactory fieldsFactory = CorefieldsFactory.eINSTANCE;

		Package myPackage = hubFactory.createPackage();

		myPackage.setGroup("de.enithing.contenthub");
		myPackage.setName("bookstore");
		myPackage.setTitle("Bookstore package");
		myPackage.setVersion("1.0.0");
		myPackage.setAuthor("J.R. Baboon");
		myPackage.setDescription("A book store package");

		ContentFragmentModelSet models = cfFactory.createContentFragmentModelSet();
		models.setPackage(myPackage);

		ContentFragmentModel bookModel = cfFactory.createContentFragmentModel();
		bookModel.setId("book");
		bookModel.setTitle("book");
		bookModel.setDescription("A book as part of the library");
		bookModel.setModelSet(models);

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
			tab.setDescription("additional information");

			bookModel.getFields().add(tab);

			{
				MultiLineText field = fieldsFactory.createMultiLineText();
				field.setPropertyName("abstract");
				field.setFieldLabel("abstract");
				field.setDescription("the abstract of the book");

				tab.getFields().add(field);
			}

			{
				MultiLineText field = fieldsFactory.createMultiLineText();
				field.setPropertyName("examples");
				field.setFieldLabel("examples");
				field.setDescription("reading examples of the book");
				field.setAllowMultiple(true);

				tab.getFields().add(field);
			}

			{
				Enumeration field = fieldsFactory.createEnumeration();

				field.setPropertyName("genre");
				field.setFieldLabel("book genre");
				field.setDescription("the genre of the book");

				{
					EnumerationOption opt = fieldsFactory.createEnumerationOption();
					opt.setKey("scifi");
					opt.setValue("science fiction");
					field.getOptions().add(opt);
				}

				{
					EnumerationOption opt = fieldsFactory.createEnumerationOption();
					opt.setKey("drama");
					opt.setValue("drama");
					field.getOptions().add(opt);
				}

				field.setRequired(true);

				tab.getFields().add(field);
			}
		}

		ContentFragmentModel libraryModel = cfFactory.createContentFragmentModel();
		libraryModel.setId("library");
		libraryModel.setTitle("library");
		libraryModel.setDescription("A library");
		libraryModel.setModelSet(models);

		{
			FragmentReference field = fieldsFactory.createFragmentReference();
			field.setPropertyName("books");
			field.setFieldLabel("books");
			field.setDescription("the books of the library");
			field.setAllowFragmentCreation(false);
			field.setAllowMultiple(true);
			field.getAllowedModels().add(bookModel);

			libraryModel.getFields().add(field);
		}

		Context booksContext = hubFactory.createContext();
		booksContext.setName("books");
		booksContext.setParentContext(myPackage.getContentRoot());
		booksContext.setTitle("All the books");

		AllowedContentFragmentModelPolicy onlyBooksPolicy = cfFactory.createAllowedContentFragmentModelPolicy();
		onlyBooksPolicy.getModels().add(bookModel);
		booksContext.getPolicies().add(onlyBooksPolicy);

		ContentFragmentInstance book = cfFactory.createContentFragmentInstance();
		book.setModel(bookModel);
		book.setId("necronomicon");
		book.setTitle("The Necronomicon");

		{
			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFieldByName("added_date"));

			DateTimeValue value = fieldsFactory.createDateTimeValue();
			value.setValue(Date.from(Instant.now()));

			field.setValue(value);
			book.getFields().add(field);
		}

		{
			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFieldByName("title"));

			StringValue value = fieldsFactory.createStringValue();
			value.setValue("The Necronomicon");

			field.setValue(value);
			book.getFields().add(field);
		}

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFieldByName("author"));

			StringValue value = fieldsFactory.createStringValue();
			value.setValue("Abdul Alhazred");

			field.setValue(value);
			book.getFields().add(field);
		}

		{

			ContentFragmentFieldInstance field = cfFactory.createContentFragmentFieldInstance();
			field.setFieldtype(bookModel.getFieldByName("genre"));

			StringValue value = fieldsFactory.createStringValue();
			value.setValue("scifi");

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
			field.setFieldtype(libraryModel.getFields().get(0));

			FragmentReferenceValue value = fieldsFactory.createFragmentReferenceValue();
			value.getFragments().add(book);

			field.setValue(value);
			library.getFields().add(field);
		}

		Context libraryContext = hubFactory.createContext();
		libraryContext.setName("libraries");
		libraryContext.setParentContext(myPackage.getContentRoot());
		libraryContext.setTitle("Libraries");
		library.setContext(libraryContext);

		PackageGenerator gen = createPackageGenerator();

		assertDoesNotThrow(() -> gen.generate(myPackage));
	}
}
