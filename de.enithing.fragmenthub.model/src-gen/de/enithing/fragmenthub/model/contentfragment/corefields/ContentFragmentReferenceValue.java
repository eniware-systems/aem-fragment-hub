/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import org.eclipse.emf.common.util.EList;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Fragment Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.ContentFragmentReferenceValue#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getContentFragmentReferenceValue()
 * @model
 * @generated
 */
public interface ContentFragmentReferenceValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getContentFragmentReferenceValue_Fragments()
	 * @model
	 * @generated
	 */
	EList<ContentFragmentInstance> getFragments();

} // ContentFragmentReferenceValue
