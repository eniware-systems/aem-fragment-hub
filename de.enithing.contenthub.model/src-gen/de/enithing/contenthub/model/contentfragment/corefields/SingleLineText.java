/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.MultiFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Line Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholderText <em>Placeholder Text</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText()
 * @model
 * @generated
 */
public interface SingleLineText extends MultiFieldType<TextValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder Text</em>' attribute.
	 * @see #setPlaceholderText(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_PlaceholderText()
	 * @model
	 * @generated
	 */
	String getPlaceholderText();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholderText <em>Placeholder Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder Text</em>' attribute.
	 * @see #getPlaceholderText()
	 * @generated
	 */
	void setPlaceholderText(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_MaxLength()
	 * @model default="255"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Translatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translatable</em>' attribute.
	 * @see #setTranslatable(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Translatable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isTranslatable <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */
	void setTranslatable(boolean value);

} // SingleLineText
