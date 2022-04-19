/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.MultiFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Line Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isAllowFragmentReference <em>Allow Fragment Reference</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText()
 * @model
 * @generated
 */
public interface MultiLineText extends MultiFieldType<StringValue> {
	/**
	 * Returns the value of the '<em><b>Default Type</b></em>' attribute.
	 * The default value is <code>"text/html"</code>.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contentfragment.corefields.TextMimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextMimeType
	 * @see #setDefaultType(TextMimeType)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText_DefaultType()
	 * @model default="text/html" required="true"
	 * @generated
	 */
	TextMimeType getDefaultType();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getDefaultType <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextMimeType
	 * @see #getDefaultType()
	 * @generated
	 */
	void setDefaultType(TextMimeType value);

	/**
	 * Returns the value of the '<em><b>Allow Fragment Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Fragment Reference</em>' attribute.
	 * @see #setAllowFragmentReference(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText_AllowFragmentReference()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowFragmentReference();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isAllowFragmentReference <em>Allow Fragment Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Fragment Reference</em>' attribute.
	 * @see #isAllowFragmentReference()
	 * @generated
	 */
	void setAllowFragmentReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Translatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translatable</em>' attribute.
	 * @see #setTranslatable(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText_Translatable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isTranslatable <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */
	void setTranslatable(boolean value);

} // MultiLineText
