/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;

import de.enithing.contenthub.model.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Line Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiLineTextTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiLineTextTest.class);
	}

	/**
	 * Constructs a new Multi Line Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLineTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Line Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiLineText getFixture() {
		return (MultiLineText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createMultiLineText());
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

} //MultiLineTextTest
