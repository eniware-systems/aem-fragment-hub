package de.enithing.contenthub.model.contentfragment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentUtils;
import de.enithing.contenthub.model.contenthub.Context;

public class ExtendedContentFragmentInstanceItemProvider extends ContentFragmentInstanceItemProvider {

	public ExtendedContentFragmentInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ContentFragmentInstance_model_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ContentFragmentInstance_model_feature",
						"_UI_ContentFragmentInstance_type"),
				ContentFragmentPackage.Literals.CONTENT_FRAGMENT_INSTANCE__MODEL, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// Restrict the choice of values to the allowed content fragment models here.
				ContentFragmentInstance instance = (ContentFragmentInstance) object;
				Context ctx = (Context) instance.eContainer();
				
				Collection<ContentFragmentModel> availableModels = ContentFragmentUtils.getAvailableModelsForContext(ctx);
				
				List<?> choiceOfValues = super.getChoiceOfValues(object)
						.stream()
						.filter(m -> availableModels.contains(m))
						.toList();
				
				return choiceOfValues;				
			}
		});
	}

}
