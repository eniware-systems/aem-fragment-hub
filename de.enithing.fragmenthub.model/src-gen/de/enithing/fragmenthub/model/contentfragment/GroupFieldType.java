/**
 */
package de.enithing.fragmenthub.model.contentfragment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.GroupFieldType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getGroupFieldType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GroupFieldType<TValue extends ContentFragmentFieldValue> extends ContentFragmentFieldType<TValue> {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.fragmenthub.model.contentfragment.SimpleFieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getGroupFieldType_Fields()
	 * @model containment="true" keys="propertyName"
	 * @generated
	 */
	EList<SimpleFieldType> getFields();

} // GroupFieldType
