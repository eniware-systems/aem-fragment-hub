/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.validation;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Size Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage#getFileSizeValue()
 * @model
 * @generated
 */
public interface FileSizeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage#getFileSizeValue_Value()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"MB"</code>.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeUnit
	 * @see #setUnit(FileSizeUnit)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage#getFileSizeValue_Unit()
	 * @model default="MB" required="true"
	 * @generated
	 */
	FileSizeUnit getUnit();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(FileSizeUnit value);

} // FileSizeValue
