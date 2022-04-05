/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contenthub.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Line Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleLineTextTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleLineTextTest.class);
	}

	/**
	 * Constructs a new Single Line Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLineTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Line Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleLineText getFixture() {
		return (SingleLineText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createSingleLineText());
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

} //SingleLineTextTest
