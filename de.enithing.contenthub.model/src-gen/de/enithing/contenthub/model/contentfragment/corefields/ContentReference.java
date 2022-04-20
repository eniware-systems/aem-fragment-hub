/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.MultiFieldType;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;

import de.enithing.contenthub.model.contenthub.PathProvider;
import java.math.BigInteger;

import java.nio.file.Path;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getAllowedContentTypes <em>Allowed Content Types</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isShowThumbnail <em>Show Thumbnail</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getFileSizeValidationConstraint <em>File Size Validation Constraint</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageWidthConstraint <em>Image Width Constraint</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageHeightConstraint <em>Image Height Constraint</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference()
 * @model
 * @generated
 */
public interface ContentReference extends MultiFieldType<ContentReferenceValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(Path)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_DefaultValue()
	 * @model dataType="de.enithing.contenthub.model.contenthub.Path"
	 * @generated
	 */
	Path getDefaultValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Path value);

	/**
	 * Returns the value of the '<em><b>Root Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Path</em>' containment reference.
	 * @see #setRootPath(PathProvider)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_RootPath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathProvider getRootPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getRootPath <em>Root Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Path</em>' containment reference.
	 * @see #getRootPath()
	 * @generated
	 */
	void setRootPath(PathProvider value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowed Content Types</b></em>' attribute list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType}.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Content Types</em>' attribute list.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_AllowedContentTypes()
	 * @model
	 * @generated
	 */
	EList<ContentReferenceType> getAllowedContentTypes();

	/**
	 * Returns the value of the '<em><b>Show Thumbnail</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Thumbnail</em>' attribute.
	 * @see #setShowThumbnail(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_ShowThumbnail()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isShowThumbnail();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isShowThumbnail <em>Show Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Thumbnail</em>' attribute.
	 * @see #isShowThumbnail()
	 * @generated
	 */
	void setShowThumbnail(boolean value);

	/**
	 * Returns the value of the '<em><b>File Size Validation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size Validation Constraint</em>' containment reference.
	 * @see #setFileSizeValidationConstraint(ValidationConstraint)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_FileSizeValidationConstraint()
	 * @model type="de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint&lt;org.eclipse.emf.ecore.EBigInteger&gt;" containment="true"
	 * @generated
	 */
	ValidationConstraint<BigInteger> getFileSizeValidationConstraint();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getFileSizeValidationConstraint <em>File Size Validation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size Validation Constraint</em>' containment reference.
	 * @see #getFileSizeValidationConstraint()
	 * @generated
	 */
	void setFileSizeValidationConstraint(ValidationConstraint<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Image Width Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Width Constraint</em>' containment reference.
	 * @see #setImageWidthConstraint(ValidationConstraint)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_ImageWidthConstraint()
	 * @model type="de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint&lt;org.eclipse.emf.ecore.EBigInteger&gt;" containment="true"
	 * @generated
	 */
	ValidationConstraint<BigInteger> getImageWidthConstraint();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageWidthConstraint <em>Image Width Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Width Constraint</em>' containment reference.
	 * @see #getImageWidthConstraint()
	 * @generated
	 */
	void setImageWidthConstraint(ValidationConstraint<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Image Height Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Height Constraint</em>' containment reference.
	 * @see #setImageHeightConstraint(ValidationConstraint)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReference_ImageHeightConstraint()
	 * @model type="de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint&lt;org.eclipse.emf.ecore.EBigInteger&gt;" containment="true"
	 * @generated
	 */
	ValidationConstraint<BigInteger> getImageHeightConstraint();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageHeightConstraint <em>Image Height Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Height Constraint</em>' containment reference.
	 * @see #getImageHeightConstraint()
	 * @generated
	 */
	void setImageHeightConstraint(ValidationConstraint<BigInteger> value);

} // ContentReference
