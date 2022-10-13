/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import org.eclipse.emf.common.util.EList;

import de.enithing.fragmenthub.model.contentfragment.SimpleFieldType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#getOptions <em>Options</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends SimpleFieldType<StringValue> {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumeration_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumeration_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#getPlaceholder <em>Placeholder</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumeration_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumeration_Unique()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // Enumeration
