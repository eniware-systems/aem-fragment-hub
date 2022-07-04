package de.enithing.contenthub.model.contentfragment.impl;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentUtils;
import de.enithing.contenthub.model.contentfragment.util.NameGenerationUtils;

public class ContentFragmentInstanceExtendedImpl extends ContentFragmentInstanceImpl {	
	@Override
	public void setId(String newId) {
		if (getContext() != null) {
					
			Collection<ContentFragmentModel> allModels = ContentFragmentUtils.getAvailableModelsForContext(getContext());

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