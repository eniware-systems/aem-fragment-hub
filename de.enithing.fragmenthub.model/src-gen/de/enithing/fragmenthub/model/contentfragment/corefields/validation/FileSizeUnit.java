/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>File Size Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#getFileSizeUnit()
 * @model
 * @generated
 */
public enum FileSizeUnit implements Enumerator {
	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(0, "B", "B"),

	/**
	 * The '<em><b>KB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB_VALUE
	 * @generated
	 * @ordered
	 */
	KB(1, "KB", "KB"),

	/**
	 * The '<em><b>MB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MB_VALUE
	 * @generated
	 * @ordered
	 */
	MB(2, "MB", "MB"),

	/**
	 * The '<em><b>GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB_VALUE
	 * @generated
	 * @ordered
	 */
	GB(3, "GB", "GB"),

	/**
	 * The '<em><b>TB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TB_VALUE
	 * @generated
	 * @ordered
	 */
	TB(4, "TB", "TB");

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 0;

	/**
	 * The '<em><b>KB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KB_VALUE = 1;

	/**
	 * The '<em><b>MB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MB_VALUE = 2;

	/**
	 * The '<em><b>GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GB_VALUE = 3;

	/**
	 * The '<em><b>TB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TB_VALUE = 4;

	/**
	 * An array of all the '<em><b>File Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileSizeUnit[] VALUES_ARRAY =
		new FileSizeUnit[] {
			B,
			KB,
			MB,
			GB,
			TB,
		};

	/**
	 * A public read-only list of all the '<em><b>File Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileSizeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Size Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileSizeUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileSizeUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Size Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileSizeUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileSizeUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Size Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FileSizeUnit get(int value) {
		switch (value) {
			case B_VALUE: return B;
			case KB_VALUE: return KB;
			case MB_VALUE: return MB;
			case GB_VALUE: return GB;
			case TB_VALUE: return TB;
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
	private FileSizeUnit(int value, String name, String literal) {
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
	
} //FileSizeUnit
