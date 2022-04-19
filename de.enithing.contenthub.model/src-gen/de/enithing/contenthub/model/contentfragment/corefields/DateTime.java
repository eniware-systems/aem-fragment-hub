/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.SimpleFieldType;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getType <em>Type</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTime()
 * @model
 * @generated
 */
public interface DateTime extends SimpleFieldType<DateTimeValue> {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * The default value is <code>"YYYY-MM-DD HH:mm:ss"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTime_Placeholder()
	 * @model default="YYYY-MM-DD HH:mm:ss" required="true"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"datetime"</code>.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeType
	 * @see #setType(DateTimeType)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTime_Type()
	 * @model default="datetime" required="true"
	 * @generated
	 */
	DateTimeType getType();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeType
	 * @see #getType()
	 * @generated
	 */
	void setType(DateTimeType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(Date)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTime_DefaultValue()
	 * @model dataType="de.enithing.contenthub.model.contentfragment.corefields.Date"
	 * @generated
	 */
	Date getDefaultValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Date value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTime_Required()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // DateTime
