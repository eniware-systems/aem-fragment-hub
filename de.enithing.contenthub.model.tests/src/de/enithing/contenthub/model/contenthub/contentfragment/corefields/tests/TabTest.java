/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.tests;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.Tab;

import de.enithing.contenthub.model.contenthub.contentfragment.tests.ContentFragmentFieldTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TabTest extends ContentFragmentFieldTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TabTest.class);
	}

	/**
	 * Constructs a new Tab test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tab test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tab getFixture() {
		return (Tab)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CorefieldsFactory.eINSTANCE.createTab());
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

} //TabTest
