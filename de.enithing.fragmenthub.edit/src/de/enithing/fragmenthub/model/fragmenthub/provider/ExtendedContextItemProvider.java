package de.enithing.fragmenthub.model.fragmenthub.provider;

import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CommandParameter;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.util.ContentFragmentUtils;
import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.provider.ContextItemProvider;

public class ExtendedContextItemProvider extends ContextItemProvider {

	public ExtendedContextItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		Context ctx = (Context) object;

		Collection<ContentFragmentModel> availableModels = ContentFragmentUtils.getAvailableModelsForContext(ctx);

		if (availableModels.isEmpty()) {
			Stream<CommandParameter> params = newChildDescriptors.stream().filter(d -> d instanceof CommandParameter)
					.map(d -> (CommandParameter) d);
			EReference feature = FragmentHubPackage.Literals.CONTEXT__CONTENT_FRAGMENTS;
			CommandParameter param = params.filter(cmd -> cmd.getFeature() == feature).findFirst().orElseThrow();

			newChildDescriptors.remove(param);
		}
	}

}
