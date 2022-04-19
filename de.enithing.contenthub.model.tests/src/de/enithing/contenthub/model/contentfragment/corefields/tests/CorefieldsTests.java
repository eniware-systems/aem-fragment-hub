/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>corefields</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorefieldsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CorefieldsTests("corefields Tests");
		suite.addTestSuite(SingleLineTextTest.class);
		suite.addTestSuite(MultiLineTextTest.class);
		suite.addTestSuite(NumberTest.class);
		suite.addTestSuite(BooleanTest.class);
		suite.addTestSuite(DateTimeTest.class);
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(TagsTest.class);
		suite.addTestSuite(ContentReferenceTest.class);
		suite.addTestSuite(FragmentReferenceTest.class);
		suite.addTestSuite(JsonTest.class);
		suite.addTestSuite(TabTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsTests(String name) {
		super(name);
	}

} //CorefieldsTests
