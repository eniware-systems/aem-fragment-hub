/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;

import de.enithing.contenthub.model.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Content Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentReferenceTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContentReferenceTest.class);
	}

	/**
	 * Constructs a new Content Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Content Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContentReference getFixture() {
		return (ContentReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createContentReference());
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

} //ContentReferenceTest
