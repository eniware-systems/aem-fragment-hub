/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.provider;


import de.enithing.contenthub.edit.ContentHubEditPlugin;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;

import de.enithing.contenthub.model.contentfragment.provider.ContentFragmentFieldTypeItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.enithing.contenthub.model.contentfragment.corefields.Tab} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TabItemProvider extends ContentFragmentFieldTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS);
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
	 * This returns Tab.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tab"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tab)object).getPropertyName();
		return label == null || label.length() == 0 ?
			getString("_UI_Tab_type") :
			getString("_UI_Tab_type") + " " + label;
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

		switch (notification.getFeatureID(Tab.class)) {
			case CorefieldsPackage.TAB__FIELDS:
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
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createSingleLineText()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createMultiLineText()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createTags()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createFragmentReference()));

		newChildDescriptors.add
			(createChildParameter
				(ContentFragmentPackage.Literals.GROUP_FIELD_TYPE__FIELDS,
				 CorefieldsFactory.eINSTANCE.createJson()));
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
