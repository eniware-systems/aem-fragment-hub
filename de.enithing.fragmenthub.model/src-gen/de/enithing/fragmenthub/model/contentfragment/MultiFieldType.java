/**
 */
package de.enithing.fragmenthub.model.contentfragment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.MultiFieldType#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.MultiFieldType#getMaxItems <em>Max Items</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getMultiFieldType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MultiFieldType<TValue extends ContentFragmentFieldValue> extends SimpleFieldType<TValue> {
	/**
	 * Returns the value of the '<em><b>Allow Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Multiple</em>' attribute.
	 * @see #setAllowMultiple(boolean)
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getMultiFieldType_AllowMultiple()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowMultiple();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.MultiFieldType#isAllowMultiple <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple</em>' attribute.
	 * @see #isAllowMultiple()
	 * @generated
	 */
	void setAllowMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(int)
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getMultiFieldType_MaxItems()
	 * @model
	 * @generated
	 */
	int getMaxItems();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.MultiFieldType#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(int value);

} // MultiFieldType
