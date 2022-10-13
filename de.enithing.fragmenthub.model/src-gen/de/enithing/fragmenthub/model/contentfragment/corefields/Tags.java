/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import de.enithing.fragmenthub.model.contentfragment.MultiFieldType;
import de.enithing.fragmenthub.model.fragmenthub.PathProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#getRootPath <em>Root Path</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getTags()
 * @model
 * @generated
 */
public interface Tags extends MultiFieldType<StringValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getTags_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#getPlaceholder <em>Placeholder</em>}' attribute.
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
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getTags_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Root Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Path</em>' containment reference.
	 * @see #setRootPath(PathProvider)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getTags_RootPath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathProvider getRootPath();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags#getRootPath <em>Root Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Path</em>' containment reference.
	 * @see #getRootPath()
	 * @generated
	 */
	void setRootPath(PathProvider value);

} // Tags
