/**
 */
package de.enithing.contenthub.model.contenthub.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>contenthub</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentHubTests extends TestSuite {

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
		TestSuite suite = new ContentHubTests("contenthub Tests");
		suite.addTestSuite(ContextTest.class);
		suite.addTestSuite(RootContextTest.class);
		suite.addTestSuite(ChildContextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHubTests(String name) {
		super(name);
	}

} //ContentHubTests
