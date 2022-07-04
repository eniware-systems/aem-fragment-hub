/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;

import de.enithing.contenthub.model.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TagsTest.class);
	}

	/**
	 * Constructs a new Tags test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tags getFixture() {
		return (Tags)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createTags());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TagsTest
