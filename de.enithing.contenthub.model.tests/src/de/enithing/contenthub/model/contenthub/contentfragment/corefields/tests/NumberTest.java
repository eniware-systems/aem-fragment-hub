/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsFactory;

import de.enithing.contenthub.model.contenthub.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberTest.class);
	}

	/**
	 * Constructs a new Number test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected de.enithing.contenthub.model.contenthub.contentfragment.corefields.Number getFixture() {
		return (de.enithing.contenthub.model.contenthub.contentfragment.corefields.Number)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createNumber());
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

} //NumberTest
