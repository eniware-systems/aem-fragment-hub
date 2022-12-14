/**
 */
package de.enithing.fragmenthub.model.contentfragment.provider;


import de.enithing.fragmenthub.edit.FragmentHubEditPlugin;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentFragmentModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentModelItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentFragmentModel_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentFragmentModel_id_feature", "_UI_ContentFragmentModel_type"),
				 ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentFragmentModel_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentFragmentModel_title_feature", "_UI_ContentFragmentModel_type"),
				 ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContentFragmentModel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContentFragmentModel_description_feature", "_UI_ContentFragmentModel_type"),
				 ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS);
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
	 * This returns ContentFragmentModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContentFragmentModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContentFragmentModel)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentFragmentModel_type") :
			getString("_UI_ContentFragmentModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContentFragmentModel.class)) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID:
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE:
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
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
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createSingleLineText()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createMultiLineText()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createTags()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createFragmentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createJson()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL__FIELDS,
				 CorefieldsFactory.eINSTANCE.createTab()));
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
