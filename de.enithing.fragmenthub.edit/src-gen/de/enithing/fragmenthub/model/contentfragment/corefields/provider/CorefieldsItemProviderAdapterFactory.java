/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.enithing.fragmenthub.model.contentfragment.corefields.util.CorefieldsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorefieldsItemProviderAdapterFactory extends CorefieldsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.StringValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValueItemProvider stringValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.StringValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringValueAdapter() {
		if (stringValueItemProvider == null) {
			stringValueItemProvider = new StringValueItemProvider(this);
		}

		return stringValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleLineTextItemProvider singleLineTextItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleLineTextAdapter() {
		if (singleLineTextItemProvider == null) {
			singleLineTextItemProvider = new SingleLineTextItemProvider(this);
		}

		return singleLineTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiLineTextItemProvider multiLineTextItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiLineTextAdapter() {
		if (multiLineTextItemProvider == null) {
			multiLineTextItemProvider = new MultiLineTextItemProvider(this);
		}

		return multiLineTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Number} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberItemProvider numberItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Number}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberAdapter() {
		if (numberItemProvider == null) {
			numberItemProvider = new NumberItemProvider(this);
		}

		return numberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.NumberValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberValueItemProvider numberValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.NumberValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberValueAdapter() {
		if (numberValueItemProvider == null) {
			numberValueItemProvider = new NumberValueItemProvider(this);
		}

		return numberValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueItemProvider booleanValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanValueAdapter() {
		if (booleanValueItemProvider == null) {
			booleanValueItemProvider = new BooleanValueItemProvider(this);
		}

		return booleanValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.DateTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeItemProvider dateTimeItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.DateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateTimeAdapter() {
		if (dateTimeItemProvider == null) {
			dateTimeItemProvider = new DateTimeItemProvider(this);
		}

		return dateTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeValueItemProvider dateTimeValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateTimeValueAdapter() {
		if (dateTimeValueItemProvider == null) {
			dateTimeValueItemProvider = new DateTimeValueItemProvider(this);
		}

		return dateTimeValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationOptionItemProvider enumerationOptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationOptionAdapter() {
		if (enumerationOptionItemProvider == null) {
			enumerationOptionItemProvider = new EnumerationOptionItemProvider(this);
		}

		return enumerationOptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagsItemProvider tagsItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Tags}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagsAdapter() {
		if (tagsItemProvider == null) {
			tagsItemProvider = new TagsItemProvider(this);
		}

		return tagsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.ContentReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentReferenceItemProvider contentReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.ContentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContentReferenceAdapter() {
		if (contentReferenceItemProvider == null) {
			contentReferenceItemProvider = new ContentReferenceItemProvider(this);
		}

		return contentReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentReferenceValueItemProvider contentReferenceValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContentReferenceValueAdapter() {
		if (contentReferenceValueItemProvider == null) {
			contentReferenceValueItemProvider = new ContentReferenceValueItemProvider(this);
		}

		return contentReferenceValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentReferenceItemProvider fragmentReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFragmentReferenceAdapter() {
		if (fragmentReferenceItemProvider == null) {
			fragmentReferenceItemProvider = new FragmentReferenceItemProvider(this);
		}

		return fragmentReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentReferenceValueItemProvider fragmentReferenceValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFragmentReferenceValueAdapter() {
		if (fragmentReferenceValueItemProvider == null) {
			fragmentReferenceValueItemProvider = new FragmentReferenceValueItemProvider(this);
		}

		return fragmentReferenceValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Json} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonItemProvider jsonItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Json}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonAdapter() {
		if (jsonItemProvider == null) {
			jsonItemProvider = new JsonItemProvider(this);
		}

		return jsonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.enithing.fragmenthub.model.contentfragment.corefields.Tab} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabItemProvider tabItemProvider;

	/**
	 * This creates an adapter for a {@link de.enithing.fragmenthub.model.contentfragment.corefields.Tab}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTabAdapter() {
		if (tabItemProvider == null) {
			tabItemProvider = new TabItemProvider(this);
		}

		return tabItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (stringValueItemProvider != null) stringValueItemProvider.dispose();
		if (singleLineTextItemProvider != null) singleLineTextItemProvider.dispose();
		if (multiLineTextItemProvider != null) multiLineTextItemProvider.dispose();
		if (numberItemProvider != null) numberItemProvider.dispose();
		if (numberValueItemProvider != null) numberValueItemProvider.dispose();
		if (booleanItemProvider != null) booleanItemProvider.dispose();
		if (booleanValueItemProvider != null) booleanValueItemProvider.dispose();
		if (dateTimeItemProvider != null) dateTimeItemProvider.dispose();
		if (dateTimeValueItemProvider != null) dateTimeValueItemProvider.dispose();
		if (enumerationOptionItemProvider != null) enumerationOptionItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (tagsItemProvider != null) tagsItemProvider.dispose();
		if (contentReferenceItemProvider != null) contentReferenceItemProvider.dispose();
		if (contentReferenceValueItemProvider != null) contentReferenceValueItemProvider.dispose();
		if (fragmentReferenceItemProvider != null) fragmentReferenceItemProvider.dispose();
		if (fragmentReferenceValueItemProvider != null) fragmentReferenceValueItemProvider.dispose();
		if (jsonItemProvider != null) jsonItemProvider.dispose();
		if (tabItemProvider != null) tabItemProvider.dispose();
	}

}