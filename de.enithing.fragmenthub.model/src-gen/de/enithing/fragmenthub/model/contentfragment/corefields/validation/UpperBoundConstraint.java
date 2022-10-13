/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#getUpperBoundConstraint()
 * @model
 * @generated
 */
public interface UpperBoundConstraint<TValue> extends ValidationConstraint<TValue> {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Object)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#getUpperBoundConstraint_Max()
	 * @model
	 * @generated
	 */
	TValue getMax();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(TValue value);

} // UpperBoundConstraint
