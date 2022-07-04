/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.validation.tests;

import de.enithing.contenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Upper Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpperBoundConstraintTest extends TestCase {

	/**
	 * The fixture for this Upper Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperBoundConstraint<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpperBoundConstraintTest.class);
	}

	/**
	 * Constructs a new Upper Bound Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Upper Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UpperBoundConstraint<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Upper Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperBoundConstraint<?> getFixture() {
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
		setFixture(ValidationFactory.eINSTANCE.createUpperBoundConstraint());
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

} //UpperBoundConstraintTest
