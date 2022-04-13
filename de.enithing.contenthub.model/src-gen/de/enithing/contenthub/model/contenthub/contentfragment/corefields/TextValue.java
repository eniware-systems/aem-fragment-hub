/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.corefields.TextValue#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage#getTextValue()
 * @model
 * @generated
 */
public interface TextValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage#getTextValue_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.corefields.TextValue#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextValue
