package de.enithing.contenthub.model.contenthub.contentfragment.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.util.NameGenerationUtils;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

/**
 * Extended implementation of the ContentFragmentModel type
 */
public class ContentFragmentModelExtendedImpl extends ContentFragmentModelImpl {
	/**
	 * Initializes mandatory settings of a new field type
	 * 
	 * @param model     The model this field type belongs to
	 * @param fieldType The field type to initialize
	 */
	private static void intializeField(ContentFragmentModel model, ContentFragmentFieldType<?> fieldType) {
		// Generate a unique id for the new field
		String baseId = fieldType.getId() != null ? fieldType.getId()
				: fieldType.getLabel() != null ? fieldType.getLabel() : fieldType.eClass().getName();
		baseId = NameGenerationUtils.toMachineString(baseId, true);

		fieldType.setId(
				NameGenerationUtils.generateName(baseId, model.getFields(), f -> f.getId(), "{0}_{1}", fieldType));

		// Generate a label for the new field
		String baseLabel = fieldType.getLabel() != null ? fieldType.getLabel() : fieldType.eClass().getName();
		fieldType.setLabel(NameGenerationUtils.generateName(baseLabel, model.getFields(), f -> f.getLabel(),
				"{0} ({1})", fieldType));
	}

	public ContentFragmentModelExtendedImpl() {
		final ContentFragmentModel model = this;

		Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {

				if (msg.getFeature().equals(ContentfragmentPackage.eINSTANCE.getContentFragmentModel_Fields())) {
					// Collect the new/updated fields ...
					List<ContentFragmentFieldType<?>> newFields = new ArrayList<>();

					if (msg.getEventType() == Notification.ADD
							&& msg.getNewValue() instanceof ContentFragmentFieldType) {
						newFields.add((ContentFragmentFieldType<?>) msg.getNewValue());
					}

					for (ContentFragmentFieldType<?> f : newFields) {
						// ... and initialize them
						intializeField(model, f);
					}
				}

				else if (msg.getFeature().equals(ContentfragmentPackage.eINSTANCE.getContentFragmentModel_Title())) {
					String oldId = NameGenerationUtils.toMachineString(msg.getOldStringValue(), true);
					String id = NameGenerationUtils.toMachineString(msg.getNewStringValue(), true);

					if (StringUtils.isBlank(getId()) || getId().equals(oldId)) {
						setId(id);
					}
				}

		
				super.notifyChanged(msg);
			}
		};

		eAdapters().add(adapter);
	}
	
	@Override
	public void setId(String newId) {
		if (getContext() != null) {
			Collection<ContentFragmentModel> allModels = ContextUtils
					.findAllContextWithSameJcrPath(getContext(), false).stream()
					.flatMap(c -> c.getContentFragmentModels().stream()).filter(mdl -> mdl != this)
					.toList();

			newId = NameGenerationUtils.generateName(newId, allModels, mdl -> mdl.getId(), "{0}_{1}");
		}
		
		super.setId(newId);
	}

}
