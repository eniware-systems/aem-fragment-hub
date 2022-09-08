/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import de.enithing.fragmenthub.model.contentfragment.MultiFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Line Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isTranslatable <em>Translatable</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getValidationRegex <em>Validation Regex</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getCustomErrorMessage <em>Custom Error Message</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText()
 * @model
 * @generated
 */
public interface SingleLineText extends MultiFieldType<StringValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_MaxLength()
	 * @model default="255" required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getMaxLength <em>Max Length</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isRequired <em>Required</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isUnique <em>Unique</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_Translatable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#isTranslatable <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */
	void setTranslatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Validation Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link de.enithing.fragmenthub.model.contentfragment.corefields.TextValidationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Type</em>' attribute.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.TextValidationType
	 * @see #setValidationType(TextValidationType)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_ValidationType()
	 * @model default="None" required="true"
	 * @generated
	 */
	TextValidationType getValidationType();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getValidationType <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Type</em>' attribute.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.TextValidationType
	 * @see #getValidationType()
	 * @generated
	 */
	void setValidationType(TextValidationType value);

	/**
	 * Returns the value of the '<em><b>Validation Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Regex</em>' attribute.
	 * @see #setValidationRegex(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_ValidationRegex()
	 * @model
	 * @generated
	 */
	String getValidationRegex();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getValidationRegex <em>Validation Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Regex</em>' attribute.
	 * @see #getValidationRegex()
	 * @generated
	 */
	void setValidationRegex(String value);

	/**
	 * Returns the value of the '<em><b>Custom Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Error Message</em>' attribute.
	 * @see #setCustomErrorMessage(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineText_CustomErrorMessage()
	 * @model required="true"
	 * @generated
	 */
	String getCustomErrorMessage();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText#getCustomErrorMessage <em>Custom Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Error Message</em>' attribute.
	 * @see #getCustomErrorMessage()
	 * @generated
	 */
	void setCustomErrorMessage(String value);

} // SingleLineText
