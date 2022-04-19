/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.MultiFieldType;

import java.nio.file.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isAllowFragmentCreation <em>Allow Fragment Creation</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReference()
 * @model
 * @generated
 */
public interface FragmentReference extends MultiFieldType<FragmentReferenceValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReference_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Root Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Path</em>' attribute.
	 * @see #setRootPath(Path)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReference_RootPath()
	 * @model default="" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getRootPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getRootPath <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Path</em>' attribute.
	 * @see #getRootPath()
	 * @generated
	 */
	void setRootPath(Path value);

	/**
	 * Returns the value of the '<em><b>Allow Fragment Creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Fragment Creation</em>' attribute.
	 * @see #setAllowFragmentCreation(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReference_AllowFragmentCreation()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllowFragmentCreation();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isAllowFragmentCreation <em>Allow Fragment Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Fragment Creation</em>' attribute.
	 * @see #isAllowFragmentCreation()
	 * @generated
	 */
	void setAllowFragmentCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getFragmentReference_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // FragmentReference
