package de.enithing.contenthub.model.contentfragment.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentUtils;
import de.enithing.contenthub.model.contentfragment.util.NameGenerationUtils;
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
		String baseId = fieldType.getPropertyName() != null ? fieldType.getPropertyName()
				: fieldType.getFieldLabel() != null ? fieldType.getFieldLabel() : fieldType.eClass().getName();
		baseId = NameGenerationUtils.toMachineString(baseId, true);

		fieldType.setPropertyName(NameGenerationUtils.generateName(baseId, model.getFields(), f -> f.getPropertyName(),
				"{0}_{1}", fieldType));

		// Generate a label for the new field
		String baseLabel = fieldType.getFieldLabel() != null ? fieldType.getFieldLabel() : fieldType.eClass().getName();
		fieldType.setFieldLabel(NameGenerationUtils.generateName(baseLabel, model.getFields(), f -> f.getFieldLabel(),
				"{0} ({1})", fieldType));
	}

	public ContentFragmentModelExtendedImpl() {
		final ContentFragmentModel model = this;

		Adapter adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {

				if (msg.getFeature().equals(ContentFragmentPackage.eINSTANCE.getContentFragmentModel_Fields())) {
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

				else if (msg.getFeature().equals(ContentFragmentPackage.eINSTANCE.getContentFragmentModel_Title())) {
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
			Collection<ContentFragmentModel> allModels = ContentFragmentUtils
					.getAllModelsForContext(getContext(), false).stream().filter(mdl -> mdl != this).toList();

			newId = NameGenerationUtils.generateName(newId, allModels, mdl -> mdl.getId(), "{0}_{1}");
		}

		super.setId(newId);
	}

	@Override
	public void setTitle(String newTitle) {
		String prevGeneratedId = NameGenerationUtils.toMachineString(getTitle(), true);

		super.setTitle(newTitle);

		if (StringUtils.isBlank(getId()) || StringUtils.equals(prevGeneratedId, getId())) {
			setId(NameGenerationUtils.toMachineString(newTitle, true));
		}
	}

}
