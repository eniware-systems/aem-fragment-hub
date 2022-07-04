/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends ContentFragmentFieldValue {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumberValue_Value()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // NumberValue
