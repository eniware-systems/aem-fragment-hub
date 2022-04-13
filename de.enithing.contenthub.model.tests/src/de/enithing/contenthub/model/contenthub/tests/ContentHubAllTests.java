/**
 */
package de.enithing.contenthub.model.contenthub.tests;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.tests.CorefieldsTests;

import de.enithing.contenthub.model.contenthub.contentfragment.tests.ContentfragmentTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ContentHub</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentHubAllTests extends TestSuite {

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
		TestSuite suite = new ContentHubAllTests("ContentHub Tests");
		suite.addTest(ContentHubTests.suite());
		suite.addTest(ContentfragmentTests.suite());
		suite.addTest(CorefieldsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHubAllTests(String name) {
		super(name);
	}

} //ContentHubAllTests
