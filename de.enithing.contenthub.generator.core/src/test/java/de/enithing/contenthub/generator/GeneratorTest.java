package de.enithing.contenthub.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;
import org.apache.commons.vfs2.provider.FileProvider;
import org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider;
import org.apache.commons.vfs2.provider.ram.RamFileProvider;
import org.apache.velocity.runtime.parser.ParseException;
import org.junit.jupiter.api.Test;

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
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.RootContext;

class GeneratorTest {
	public final static String VFSRootPath = "ram://virtual";

	public static FileSystemManager createVFSManager() throws FileSystemException {
		DefaultFileSystemManager manager = new DefaultFileSystemManager();
		manager.addProvider("ram", new RamFileProvider());
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
		// FileSystemManager vfs = createVFSManager();
		// cfg.targetRoot = vfs.resolveFile(VFSRootPath);

		DefaultFileSystemManager vfs = new DefaultFileSystemManager();
		vfs.addProvider("file", new DefaultLocalFileProvider());
		vfs.init();

		cfg.targetRoot = vfs.resolveFile("file:///tmp/contenthub-test");
		if (cfg.targetRoot.exists()) {
			cfg.targetRoot.deleteAll();
		}
		cfg.targetRoot.createFolder();

		PackageGenerator gen = new PackageGenerator(cfg);
		try {
			gen.generate(myPackage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
