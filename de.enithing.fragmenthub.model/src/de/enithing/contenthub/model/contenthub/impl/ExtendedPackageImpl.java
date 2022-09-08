package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextType;

public class ExtendedPackageImpl extends PackageImpl {
	public ExtendedPackageImpl() {
		Context ctx = ContentHubFactory.eINSTANCE.createContext();
		ctx.setPrimaryType(ContextType.ORDERED_FOLDER);
		setContentRoot(ctx);
	}

}
