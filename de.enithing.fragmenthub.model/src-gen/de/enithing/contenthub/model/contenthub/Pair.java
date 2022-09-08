/**
 */
package de.enithing.contenthub.model.contenthub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Pair#getKey <em>Key</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Pair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPair()
 * @model
 * @generated
 */
public interface Pair<TKey, TValue> extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(Object)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPair_Key()
	 * @model required="true"
	 * @generated
	 */
	TKey getKey();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Pair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(TKey value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPair_Value()
	 * @model required="true"
	 * @generated
	 */
	TValue getValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Pair#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TValue value);

} // Pair
