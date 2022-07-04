/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Mime Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getTextMimeType()
 * @model
 * @generated
 */
public enum TextMimeType implements Enumerator {
	/**
	 * The '<em><b>Richtext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICHTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	RICHTEXT(0, "Richtext", "text/html"),

	/**
	 * The '<em><b>Markdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKDOWN(1, "Markdown", "text/x-markdown"),

	/**
	 * The '<em><b>Plaintext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAINTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PLAINTEXT(2, "Plaintext", "text/plain");

	/**
	 * The '<em><b>Richtext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICHTEXT
	 * @model name="Richtext" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int RICHTEXT_VALUE = 0;

	/**
	 * The '<em><b>Markdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN
	 * @model name="Markdown" literal="text/x-markdown"
	 * @generated
	 * @ordered
	 */
	public static final int MARKDOWN_VALUE = 1;

	/**
	 * The '<em><b>Plaintext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAINTEXT
	 * @model name="Plaintext" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int PLAINTEXT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Text Mime Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextMimeType[] VALUES_ARRAY =
		new TextMimeType[] {
			RICHTEXT,
			MARKDOWN,
			PLAINTEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Mime Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TextMimeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Mime Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextMimeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextMimeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Mime Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextMimeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextMimeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Mime Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TextMimeType get(int value) {
		switch (value) {
			case RICHTEXT_VALUE: return RICHTEXT;
			case MARKDOWN_VALUE: return MARKDOWN;
			case PLAINTEXT_VALUE: return PLAINTEXT;
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
	private TextMimeType(int value, String name, String literal) {
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
	
} //TextMimeType
