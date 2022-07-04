/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.SimpleFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Json#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getJson()
 * @model
 * @generated
 */
public interface Json extends SimpleFieldType<StringValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getJson_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getJson_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isRequired <em>Required</em>}' attribute.
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
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getJson_Translatable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isTranslatable <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */
	void setTranslatable(boolean value);

} // Json
