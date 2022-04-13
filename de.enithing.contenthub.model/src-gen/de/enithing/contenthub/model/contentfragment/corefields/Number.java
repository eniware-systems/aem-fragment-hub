/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.SimpleFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholderText <em>Placeholder Text</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends SimpleFieldType<NumberValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder Text</em>' attribute.
	 * @see #setPlaceholderText(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_PlaceholderText()
	 * @model
	 * @generated
	 */
	String getPlaceholderText();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholderText <em>Placeholder Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder Text</em>' attribute.
	 * @see #getPlaceholderText()
	 * @generated
	 */
	void setPlaceholderText(String value);

} // Number