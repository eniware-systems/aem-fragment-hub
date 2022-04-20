/**
 */
package de.enithing.contenthub.model.contenthub.tests;

import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.SimplePath;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Path</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplePathTest extends TestCase {

	/**
	 * The fixture for this Simple Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePath fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimplePathTest.class);
	}

	/**
	 * Constructs a new Simple Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePathTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimplePath fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePath getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContentHubFactory.eINSTANCE.createSimplePath());
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

} //SimplePathTest
