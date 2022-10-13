/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#getLowerBoundConstraint()
 * @model
 * @generated
 */
public interface LowerBoundConstraint<TValue> extends ValidationConstraint<TValue> {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Object)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#getLowerBoundConstraint_Min()
	 * @model
	 * @generated
	 */
	TValue getMin();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(TValue value);

} // LowerBoundConstraint
