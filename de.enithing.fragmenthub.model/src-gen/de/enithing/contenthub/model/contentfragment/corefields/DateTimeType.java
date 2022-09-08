/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Date Time Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getDateTimeType()
 * @model
 * @generated
 */
public enum DateTimeType implements Enumerator {
	/**
	 * The '<em><b>Date And Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_AND_TIME(0, "DateAndTime", "datetime"),

	/**
	 * The '<em><b>Date Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_ONLY(1, "DateOnly", "date"),

	/**
	 * The '<em><b>Time Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_ONLY(2, "TimeOnly", "time");

	/**
	 * The '<em><b>Date And Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME
	 * @model name="DateAndTime" literal="datetime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_AND_TIME_VALUE = 0;

	/**
	 * The '<em><b>Date Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ONLY
	 * @model name="DateOnly" literal="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_ONLY_VALUE = 1;

	/**
	 * The '<em><b>Time Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY
	 * @model name="TimeOnly" literal="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Date Time Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateTimeType[] VALUES_ARRAY =
		new DateTimeType[] {
			DATE_AND_TIME,
			DATE_ONLY,
			TIME_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Date Time Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateTimeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Time Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateTimeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Time Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateTimeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Time Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimeType get(int value) {
		switch (value) {
			case DATE_AND_TIME_VALUE: return DATE_AND_TIME;
			case DATE_ONLY_VALUE: return DATE_ONLY;
			case TIME_ONLY_VALUE: return TIME_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DateTimeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DateTimeType
