/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Validation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getTextValidationType()
 * @model
 * @generated
 */
public enum TextValidationType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(1, "Email", "cfm.validation.email"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(2, "URL", "cfm.validation.url"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(3, "Custom", "cfm.validation.custom");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="Email" literal="cfm.validation.email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 1;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model literal="cfm.validation.url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 2;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom" literal="cfm.validation.custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Text Validation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextValidationType[] VALUES_ARRAY =
		new TextValidationType[] {
			NONE,
			EMAIL,
			URL,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Validation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextValidationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Validation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextValidationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextValidationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Validation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextValidationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextValidationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Validation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextValidationType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case EMAIL_VALUE: return EMAIL;
			case URL_VALUE: return URL;
			case CUSTOM_VALUE: return CUSTOM;
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
	private TextValidationType(int value, String name, String literal) {
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
	
} //TextValidationType
