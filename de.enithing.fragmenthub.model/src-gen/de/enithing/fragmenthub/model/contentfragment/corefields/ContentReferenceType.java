/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getContentReferenceType()
 * @model
 * @generated
 */
public enum ContentReferenceType implements Enumerator {
	/**
	 * The '<em><b>Richtext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICHTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	RICHTEXT(0, "Richtext", "cfm.validation.contenttype.richtext"),

	/**
	 * The '<em><b>Plaintext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAINTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PLAINTEXT(1, "Plaintext", "cfm.validation.contenttype.plaintext"),

	/**
	 * The '<em><b>Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(2, "Image", "cfm.validation.contenttype.image"),

	/**
	 * The '<em><b>Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO(3, "Audio", "cfm.validation.contenttype.audio"),

	/**
	 * The '<em><b>Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(4, "Video", "cfm.validation.contenttype.video"),

	/**
	 * The '<em><b>Content Fragment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_FRAGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_FRAGMENT(5, "ContentFragment", "cfm.validation.contenttype.contentfragment"),

	/**
	 * The '<em><b>PDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF_VALUE
	 * @generated
	 * @ordered
	 */
	PDF(6, "PDF", "cfm.validation.contenttype.pdf"),

	/**
	 * The '<em><b>Spread Sheet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPREAD_SHEET_VALUE
	 * @generated
	 * @ordered
	 */
	SPREAD_SHEET(7, "SpreadSheet", "cfm.validation.contenttype.spreadsheet"),

	/**
	 * The '<em><b>Presentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTATION(8, "Presentation", "cfm.validation.contenttype.presentation"),

	/**
	 * The '<em><b>Archive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE(9, "Archive", "cfm.validation.contenttype.archive"),

	/**
	 * The '<em><b>Markup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKUP_VALUE
	 * @generated
	 * @ordered
	 */
	MARKUP(10, "Markup", "cfm.validation.contenttype.markup");

	/**
	 * The '<em><b>Richtext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICHTEXT
	 * @model name="Richtext" literal="cfm.validation.contenttype.richtext"
	 * @generated
	 * @ordered
	 */
	public static final int RICHTEXT_VALUE = 0;

	/**
	 * The '<em><b>Plaintext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAINTEXT
	 * @model name="Plaintext" literal="cfm.validation.contenttype.plaintext"
	 * @generated
	 * @ordered
	 */
	public static final int PLAINTEXT_VALUE = 1;

	/**
	 * The '<em><b>Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model name="Image" literal="cfm.validation.contenttype.image"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 2;

	/**
	 * The '<em><b>Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO
	 * @model name="Audio" literal="cfm.validation.contenttype.audio"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_VALUE = 3;

	/**
	 * The '<em><b>Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO
	 * @model name="Video" literal="cfm.validation.contenttype.video"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 4;

	/**
	 * The '<em><b>Content Fragment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_FRAGMENT
	 * @model name="ContentFragment" literal="cfm.validation.contenttype.contentfragment"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_FRAGMENT_VALUE = 5;

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF
	 * @model literal="cfm.validation.contenttype.pdf"
	 * @generated
	 * @ordered
	 */
	public static final int PDF_VALUE = 6;

	/**
	 * The '<em><b>Spread Sheet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPREAD_SHEET
	 * @model name="SpreadSheet" literal="cfm.validation.contenttype.spreadsheet"
	 * @generated
	 * @ordered
	 */
	public static final int SPREAD_SHEET_VALUE = 7;

	/**
	 * The '<em><b>Presentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION
	 * @model name="Presentation" literal="cfm.validation.contenttype.presentation"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTATION_VALUE = 8;

	/**
	 * The '<em><b>Archive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVE
	 * @model name="Archive" literal="cfm.validation.contenttype.archive"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VALUE = 9;

	/**
	 * The '<em><b>Markup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKUP
	 * @model name="Markup" literal="cfm.validation.contenttype.markup"
	 * @generated
	 * @ordered
	 */
	public static final int MARKUP_VALUE = 10;

	/**
	 * An array of all the '<em><b>Content Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentReferenceType[] VALUES_ARRAY =
		new ContentReferenceType[] {
			RICHTEXT,
			PLAINTEXT,
			IMAGE,
			AUDIO,
			VIDEO,
			CONTENT_FRAGMENT,
			PDF,
			SPREAD_SHEET,
			PRESENTATION,
			ARCHIVE,
			MARKUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Content Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentReferenceType get(int value) {
		switch (value) {
			case RICHTEXT_VALUE: return RICHTEXT;
			case PLAINTEXT_VALUE: return PLAINTEXT;
			case IMAGE_VALUE: return IMAGE;
			case AUDIO_VALUE: return AUDIO;
			case VIDEO_VALUE: return VIDEO;
			case CONTENT_FRAGMENT_VALUE: return CONTENT_FRAGMENT;
			case PDF_VALUE: return PDF;
			case SPREAD_SHEET_VALUE: return SPREAD_SHEET;
			case PRESENTATION_VALUE: return PRESENTATION;
			case ARCHIVE_VALUE: return ARCHIVE;
			case MARKUP_VALUE: return MARKUP;
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
	private ContentReferenceType(int value, String name, String literal) {
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
	
} //ContentReferenceType
