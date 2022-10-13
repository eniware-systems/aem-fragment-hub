/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multi Line Text Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getMultiLineTextType()
 * @model
 * @generated
 */
public enum MultiLineTextType implements Enumerator {
	/**
	 * The '<em><b>Rich Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICH_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	RICH_TEXT(0, "RichText", "text/html"),

	/**
	 * The '<em><b>Markdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKDOWN(1, "Markdown", "text/markdown"),

	/**
	 * The '<em><b>Plain Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN_TEXT(2, "PlainText", "text/plain");

	/**
	 * The '<em><b>Rich Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICH_TEXT
	 * @model name="RichText" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int RICH_TEXT_VALUE = 0;

	/**
	 * The '<em><b>Markdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN
	 * @model name="Markdown" literal="text/markdown"
	 * @generated
	 * @ordered
	 */
	public static final int MARKDOWN_VALUE = 1;

	/**
	 * The '<em><b>Plain Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_TEXT
	 * @model name="PlainText" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_TEXT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Multi Line Text Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultiLineTextType[] VALUES_ARRAY =
		new MultiLineTextType[] {
			RICH_TEXT,
			MARKDOWN,
			PLAIN_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Multi Line Text Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultiLineTextType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multi Line Text Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiLineTextType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiLineTextType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multi Line Text Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiLineTextType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiLineTextType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multi Line Text Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiLineTextType get(int value) {
		switch (value) {
			case RICH_TEXT_VALUE: return RICH_TEXT;
			case MARKDOWN_VALUE: return MARKDOWN;
			case PLAIN_TEXT_VALUE: return PLAIN_TEXT;
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
	private MultiLineTextType(int value, String name, String literal) {
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
	
} //MultiLineTextType
