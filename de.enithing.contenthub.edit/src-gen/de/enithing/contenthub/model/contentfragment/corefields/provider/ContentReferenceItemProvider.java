/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.provider;


import de.enithing.contenthub.edit.ContentHubEditPlugin;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;

import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationFactory;

import de.enithing.contenthub.model.contentfragment.provider.ContentFragmentFieldTypeItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentReferenceItemProvider extends ContentFragmentFieldTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentReferenceItemProvider(AdapterFactory adapterFactory) {
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
			addRootPathPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addAllowedContentTypesPropertyDescriptor(object);
			addShowThumbnailPropertyDescriptor(object);
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
				 getString("_UI_ContentReference_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_placeholder_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__PLACEHOLDER,
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
				 getString("_UI_ContentReference_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_defaultValue_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentReference_rootPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_rootPath_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__ROOT_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_ContentReference_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_required_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Content Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedContentTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentReference_allowedContentTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_allowedContentTypes_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Thumbnail feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowThumbnailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentReference_showThumbnail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentReference_showThumbnail_feature", "_UI_ContentReference_type"),
				 CorefieldsPackage.Literals.CONTENT_REFERENCE__SHOW_THUMBNAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorefieldsPackage.Literals.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT);
			childrenFeatures.add(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT);
			childrenFeatures.add(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ContentReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContentReference)object).getPropertyName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentReference_type") :
			getString("_UI_ContentReference_type") + " " + label;
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

		switch (notification.getFeatureID(ContentReference.class)) {
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE:
			case CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS:
			case CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER:
			case CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE:
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
			case CorefieldsPackage.CONTENT_REFERENCE__REQUIRED:
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES:
			case CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createUpperBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerUpperBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createUpperBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerUpperBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createUpperBoundConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT,
				 ValidationFactory.eINSTANCE.createLowerUpperBoundConstraint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorefieldsPackage.Literals.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT ||
			childFeature == CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT ||
			childFeature == CorefieldsPackage.Literals.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ContentHubEditPlugin.INSTANCE;
	}

}
