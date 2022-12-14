/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.provider;


import de.enithing.fragmenthub.edit.FragmentHubEditPlugin;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.fragmenthub.model.contentfragment.provider.ContentFragmentFieldTypeItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleLineTextItemProvider extends ContentFragmentFieldTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLineTextItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAllowMultiplePropertyDescriptor(object);
			addMaxItemsPropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addTranslatablePropertyDescriptor(object);
			addValidationTypePropertyDescriptor(object);
			addValidationRegexPropertyDescriptor(object);
			addCustomErrorMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Multiple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowMultiplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiFieldType_allowMultiple_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiFieldType_allowMultiple_feature", "_UI_MultiFieldType_type"),
				 ContentFragmentPackage.Literals.MULTI_FIELD_TYPE__ALLOW_MULTIPLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MultiFieldType_maxItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiFieldType_maxItems_feature", "_UI_MultiFieldType_type"),
				 ContentFragmentPackage.Literals.MULTI_FIELD_TYPE__MAX_ITEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_placeholder_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_defaultValue_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_maxLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_maxLength_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__MAX_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_required_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_unique_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Translatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_translatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_translatable_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__TRANSLATABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_validationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_validationType_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__VALIDATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Regex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationRegexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_validationRegex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_validationRegex_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__VALIDATION_REGEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Error Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomErrorMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SingleLineText_customErrorMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SingleLineText_customErrorMessage_feature", "_UI_SingleLineText_type"),
				 CorefieldsPackage.Literals.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SingleLineText.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SingleLineText"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SingleLineText)object).getPropertyName();
		return label == null || label.length() == 0 ?
			getString("_UI_SingleLineText_type") :
			getString("_UI_SingleLineText_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SingleLineText.class)) {
			case CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE:
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_ITEMS:
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER:
			case CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE:
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH:
			case CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED:
			case CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE:
			case CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE:
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE:
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX:
			case CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FragmentHubEditPlugin.INSTANCE;
	}

}
