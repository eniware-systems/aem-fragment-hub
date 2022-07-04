/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.validation.tests;

import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerBoundConstraintTest extends TestCase {

	/**
	 * The fixture for this Lower Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerBoundConstraint<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowerBoundConstraintTest.class);
	}

	/**
	 * Constructs a new Lower Bound Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lower Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LowerBoundConstraint<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lower Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerBoundConstraint<?> getFixture() {
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
		setFixture(ValidationFactory.eINSTANCE.createLowerBoundConstraint());
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

} //LowerBoundConstraintTest
