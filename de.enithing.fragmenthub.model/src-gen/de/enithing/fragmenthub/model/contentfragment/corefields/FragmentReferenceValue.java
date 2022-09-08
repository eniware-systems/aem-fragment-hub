/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import org.eclipse.emf.common.util.EList;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragments <em>Fragments</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragmentsByPathPattern <em>Fragments By Path Pattern</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReferenceValue()
 * @model
 * @generated
 */
public interface FragmentReferenceValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReferenceValue_Fragments()
	 * @model
	 * @generated
	 */
	EList<ContentFragmentInstance> getFragments();

	/**
	 * Returns the value of the '<em><b>Fragments By Path Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments By Path Pattern</em>' attribute.
	 * @see #setFragmentsByPathPattern(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReferenceValue_FragmentsByPathPattern()
	 * @model
	 * @generated
	 */
	String getFragmentsByPathPattern();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragmentsByPathPattern <em>Fragments By Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragments By Path Pattern</em>' attribute.
	 * @see #getFragmentsByPathPattern()
	 * @generated
	 */
	void setFragmentsByPathPattern(String value);

} // FragmentReferenceValue
