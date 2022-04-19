/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReferenceValue()
 * @model
 * @generated
 */
public interface FragmentReferenceValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReferenceValue_Fragments()
	 * @model
	 * @generated
	 */
	EList<ContentFragmentInstance> getFragments();

} // FragmentReferenceValue
