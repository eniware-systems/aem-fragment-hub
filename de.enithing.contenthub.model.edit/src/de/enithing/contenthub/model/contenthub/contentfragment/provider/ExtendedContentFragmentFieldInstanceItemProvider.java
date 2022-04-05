package de.enithing.contenthub.model.contenthub.contentfragment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.SimpleFieldType;

/**
 * Extensions for the ContentFragmentFieldInstanceItemProvider
 */
public class ExtendedContentFragmentFieldInstanceItemProvider extends ContentFragmentFieldInstanceItemProvider {

	public ExtendedContentFragmentFieldInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addFieldtypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ContentFragmentFieldInstance_fieldtype_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ContentFragmentFieldInstance_fieldtype_feature",
						"_UI_ContentFragmentFieldInstance_type"),
				ContentfragmentPackage.Literals.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE, true, false, true, null,
				null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// Restrict the choice of values by those that are reflected in the content fragment model set for
				// the content fragment instance owning this field instance
				ContentFragmentFieldInstance fieldInstance = (ContentFragmentFieldInstance) object;
				EList<ContentFragmentFieldType> availableFieldTypes = ((ContentFragmentInstance)fieldInstance.eContainer()).getModel().getFields();
				
				List<?> choiceOfValues = super.getChoiceOfValues(object)
						.stream()
						.filter(o -> availableFieldTypes.contains(o))
						.filter(o -> o instanceof SimpleFieldType) // Ignore group fields (e.g. Tabs)
						.toList();
				
				return choiceOfValues;
			}
		});
	}

}
