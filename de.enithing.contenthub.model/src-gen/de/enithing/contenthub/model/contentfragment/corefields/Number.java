/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.SimpleFieldType;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getType <em>Type</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getValidationConstraint <em>Validation Constraint</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends SimpleFieldType<NumberValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_Placeholder()
	 * @model required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"long"</code>.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint
	 * @see #setType(NumberTypeHint)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_Type()
	 * @model default="long" required="true"
	 * @generated
	 */
	NumberTypeHint getType();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint
	 * @see #getType()
	 * @generated
	 */
	void setType(NumberTypeHint value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(BigDecimal)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_DefaultValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	BigDecimal getDefaultValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Validation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Constraint</em>' containment reference.
	 * @see #setValidationConstraint(ValidationConstraint)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getNumber_ValidationConstraint()
	 * @model type="de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint&lt;org.eclipse.emf.ecore.EBigDecimal&gt;" containment="true"
	 * @generated
	 */
	ValidationConstraint<BigDecimal> getValidationConstraint();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getValidationConstraint <em>Validation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Constraint</em>' containment reference.
	 * @see #getValidationConstraint()
	 * @generated
	 */
	void setValidationConstraint(ValidationConstraint<BigDecimal> value);

} // Number
