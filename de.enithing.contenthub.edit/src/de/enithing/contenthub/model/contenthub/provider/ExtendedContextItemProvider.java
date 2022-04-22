package de.enithing.contenthub.model.contenthub.provider;

import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CommandParameter;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentUtils;

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
			EReference feature = ContentHubPackage.Literals.CONTEXT__CONTENT_FRAGMENTS;
			CommandParameter param = params.filter(cmd -> cmd.getFeature() == feature).findFirst().orElseThrow();

			newChildDescriptors.remove(param);
		}
	}

}
