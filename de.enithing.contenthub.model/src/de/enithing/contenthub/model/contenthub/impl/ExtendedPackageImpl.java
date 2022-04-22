package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Context;

public class ExtendedPackageImpl extends PackageImpl {
	public ExtendedPackageImpl() {
		Context ctx = ContentHubFactory.eINSTANCE.createContext();
		setContentRoot(ctx);
	}

}
