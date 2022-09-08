/**
 */
package de.enithing.fragmenthub.model.fragmenthub;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Context Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contenthub.ContentHubPackage#getContextType()
 * @model
 * @generated
 */
public enum ContextType implements Enumerator {
	/**
	 * The '<em><b>Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	FOLDER(0, "folder", "sling:Folder"),

	/**
	 * The '<em><b>Ordered Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_FOLDER(1, "orderedFolder", "sling:OrderedFolder"),

	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(2, "page", "cq:Page");

	/**
	 * The '<em><b>Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER
	 * @model name="folder" literal="sling:Folder"
	 * @generated
	 * @ordered
	 */
	public static final int FOLDER_VALUE = 0;

	/**
	 * The '<em><b>Ordered Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_FOLDER
	 * @model name="orderedFolder" literal="sling:OrderedFolder"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_FOLDER_VALUE = 1;

	/**
	 * The '<em><b>Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE
	 * @model name="page" literal="cq:Page"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Context Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContextType[] VALUES_ARRAY =
		new ContextType[] {
			FOLDER,
			ORDERED_FOLDER,
			PAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Context Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContextType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Context Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextType get(int value) {
		switch (value) {
			case FOLDER_VALUE: return FOLDER;
			case ORDERED_FOLDER_VALUE: return ORDERED_FOLDER;
			case PAGE_VALUE: return PAGE;
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
	private ContextType(int value, String name, String literal) {
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
	
} //ContextType
