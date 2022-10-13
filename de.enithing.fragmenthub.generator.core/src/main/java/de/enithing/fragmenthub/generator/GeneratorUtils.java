package de.enithing.fragmenthub.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.fragmenthub.FragmentHubFactory;
import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.Package;

/**
 * Utility methods for loading packages and initializing the generator
 * 
 * @author mvonkeil
 *
 */
public class GeneratorUtils {
	private GeneratorUtils() {
	}

	/**
	 * Initializes the factories. No need to do this manually, usually this will be
	 * called when needed automatically
	 */
	public static void initFactories() {
		FragmentHubFactory.eINSTANCE.eClass();
		ContentFragmentFactory.eINSTANCE.eClass();
		CorefieldsFactory.eINSTANCE.eClass();
	}

	/**
	 * Loads a package from a given resource URI
	 * 
	 * @param uri The resource URI to load the package from
	 * @return The loaded package
	 */
	public static Package loadPackageFromUri(URI uri) {
		initFactories();

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(FragmentHubPackage.eNS_URI, FragmentHubPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ContentFragmentPackage.eNS_URI, ContentFragmentPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CorefieldsPackage.eNS_URI, CorefieldsPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(uri, true);
		return (Package) resource.getContents().get(0);
	}
}
