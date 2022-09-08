/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;

import java.nio.file.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReferenceValue()
 * @model
 * @generated
 */
public interface ContentReferenceValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Path)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReferenceValue_Value()
	 * @model dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Path value);

} // ContentReferenceValue
