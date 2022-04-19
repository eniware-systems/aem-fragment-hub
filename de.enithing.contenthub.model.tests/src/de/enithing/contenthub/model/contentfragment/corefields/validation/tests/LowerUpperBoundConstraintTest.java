/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.validation.tests;

import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Upper Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerUpperBoundConstraintTest extends LowerBoundConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowerUpperBoundConstraintTest.class);
	}

	/**
	 * Constructs a new Lower Upper Bound Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerUpperBoundConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lower Upper Bound Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LowerUpperBoundConstraint<?> getFixture() {
		return (LowerUpperBoundConstraint<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ValidationFactory.eINSTANCE.createLowerUpperBoundConstraint());
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

} //LowerUpperBoundConstraintTest
