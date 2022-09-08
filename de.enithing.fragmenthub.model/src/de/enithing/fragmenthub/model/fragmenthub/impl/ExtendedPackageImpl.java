package de.enithing.fragmenthub.model.fragmenthub.impl;

import de.enithing.fragmenthub.model.fragmenthub.ContentHubFactory;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.ContextType;
import de.enithing.fragmenthub.model.fragmenthub.impl.PackageImpl;

public class ExtendedPackageImpl extends PackageImpl {
	public ExtendedPackageImpl() {
		Context ctx = ContentHubFactory.eINSTANCE.createContext();
		ctx.setPrimaryType(ContextType.ORDERED_FOLDER);
		setContentRoot(ctx);
	}

}
