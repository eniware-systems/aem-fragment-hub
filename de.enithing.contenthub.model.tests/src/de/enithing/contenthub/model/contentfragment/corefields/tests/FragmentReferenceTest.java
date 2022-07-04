/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;

import de.enithing.contenthub.model.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fragment Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentReferenceTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FragmentReferenceTest.class);
	}

	/**
	 * Constructs a new Fragment Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fragment Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FragmentReference getFixture() {
		return (FragmentReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createFragmentReference());
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

} //FragmentReferenceTest
