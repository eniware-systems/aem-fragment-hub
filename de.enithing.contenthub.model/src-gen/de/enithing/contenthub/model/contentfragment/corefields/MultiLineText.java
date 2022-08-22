/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.MultiFieldType;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getAllowedFragmentModels <em>Allowed Fragment Models</em>}</li>
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
	 * Returns the value of the '<em><b>Allowed Fragment Models</b></em>' reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Fragment Models</em>' reference list.
	 * @see #isSetAllowedFragmentModels()
	 * @see #unsetAllowedFragmentModels()
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineText_AllowedFragmentModels()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<ContentFragmentModel> getAllowedFragmentModels();

	/**
	 * Unsets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getAllowedFragmentModels <em>Allowed Fragment Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowedFragmentModels()
	 * @see #getAllowedFragmentModels()
	 * @generated
	 */
	void unsetAllowedFragmentModels();

	/**
	 * Returns whether the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getAllowedFragmentModels <em>Allowed Fragment Models</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allowed Fragment Models</em>' reference list is set.
	 * @see #unsetAllowedFragmentModels()
	 * @see #getAllowedFragmentModels()
	 * @generated
	 */
	boolean isSetAllowedFragmentModels();

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
