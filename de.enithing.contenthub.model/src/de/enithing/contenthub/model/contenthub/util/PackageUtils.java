package de.enithing.contenthub.model.contenthub.util;

import java.nio.file.Path;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContextType;
import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.RootContext;

public class PackageUtils {
	private PackageUtils() {}
	
	public static void createDefaultPackageStructure(Package pkg) {
		RootContext cfm = ContentHubFactory.eINSTANCE.createRootContext();
		cfm.setRelativePath(Path.of("/conf/$packageName/settings/dam/cfm"));
		cfm.setPrimaryType(ContextType.PAGE);
		
		ChildContext models = ContentHubFactory.eINSTANCE.createChildContext();
		models.setRelativePath(Path.of("/models"));
		models.setPrimaryType(ContextType.PAGE);
		
		models.setParentContext(cfm);
		
		pkg.getContexts().add(cfm);
	}
}
