/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Filter Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getReferenceFilterMode()
 * @model
 * @generated
 */
public enum ReferenceFilterMode implements Enumerator {
	/**
	 * The '<em><b>Hierarchy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY(0, "hierarchy", "hierarchy");

	/**
	 * The '<em><b>Hierarchy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY
	 * @model name="hierarchy"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Reference Filter Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceFilterMode[] VALUES_ARRAY =
		new ReferenceFilterMode[] {
			HIERARCHY,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Filter Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceFilterMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Filter Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceFilterMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceFilterMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Filter Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceFilterMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceFilterMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Filter Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceFilterMode get(int value) {
		switch (value) {
			case HIERARCHY_VALUE: return HIERARCHY;
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
	private ReferenceFilterMode(int value, String name, String literal) {
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
	
} //ReferenceFilterMode
