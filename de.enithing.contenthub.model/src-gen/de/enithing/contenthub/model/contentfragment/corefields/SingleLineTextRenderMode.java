/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Single Line Text Render Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#getSingleLineTextRenderMode()
 * @model
 * @generated
 */
public enum SingleLineTextRenderMode implements Enumerator {
	/**
	 * The '<em><b>Textfield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTFIELD(0, "Textfield", "textfield"),

	/**
	 * The '<em><b>Multifield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIFIELD(1, "Multifield", "multifield");

	/**
	 * The '<em><b>Textfield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTFIELD
	 * @model name="Textfield" literal="textfield"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTFIELD_VALUE = 0;

	/**
	 * The '<em><b>Multifield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIFIELD
	 * @model name="Multifield" literal="multifield"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIFIELD_VALUE = 1;

	/**
	 * An array of all the '<em><b>Single Line Text Render Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SingleLineTextRenderMode[] VALUES_ARRAY =
		new SingleLineTextRenderMode[] {
			TEXTFIELD,
			MULTIFIELD,
		};

	/**
	 * A public read-only list of all the '<em><b>Single Line Text Render Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SingleLineTextRenderMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Single Line Text Render Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleLineTextRenderMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingleLineTextRenderMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Single Line Text Render Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleLineTextRenderMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingleLineTextRenderMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Single Line Text Render Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingleLineTextRenderMode get(int value) {
		switch (value) {
			case TEXTFIELD_VALUE: return TEXTFIELD;
			case MULTIFIELD_VALUE: return MULTIFIELD;
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
	private SingleLineTextRenderMode(int value, String name, String literal) {
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
	
} //SingleLineTextRenderMode
