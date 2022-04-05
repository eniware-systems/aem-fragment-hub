/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields;

import de.enithing.contenthub.model.contenthub.contentfragment.SimpleFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Line Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineText#getPlaceholderText <em>Placeholder Text</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage#getSingleLineText()
 * @model
 * @generated
 */
public interface SingleLineText extends SimpleFieldType<SingleLineTextValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder Text</em>' attribute.
	 * @see #setPlaceholderText(String)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage#getSingleLineText_PlaceholderText()
	 * @model
	 * @generated
	 */
	String getPlaceholderText();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineText#getPlaceholderText <em>Placeholder Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder Text</em>' attribute.
	 * @see #getPlaceholderText()
	 * @generated
	 */
	void setPlaceholderText(String value);

} // SingleLineText
