package de.enithing.contenthub.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Package;

public class GeneratorUtils {
	private GeneratorUtils() {
	}

	public static void initFactories() {
		ContentHubFactory.eINSTANCE.eClass();
		ContentFragmentFactory.eINSTANCE.eClass();
		CorefieldsFactory.eINSTANCE.eClass();
	}

	public static Package loadPackageFromUri(URI uri) {
		initFactories();

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ContentHubPackage.eNS_URI, ContentHubPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ContentFragmentPackage.eNS_URI, ContentFragmentPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CorefieldsPackage.eNS_URI, CorefieldsPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(uri, true);
		return (Package) resource.getContents().get(0);
	}
}
