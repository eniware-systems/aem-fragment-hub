package de.enithing.contenthub.importer.util;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Package;
import org.apache.commons.vfs2.FileObject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

public class ImporterUtils {
    private ImporterUtils() {}

    /**
     * Initializes the factories. No need to do this manually, usually this will be
     * called when needed automatically
     */
    public static void initFactories() {
        ContentHubFactory.eINSTANCE.eClass();
        ContentFragmentFactory.eINSTANCE.eClass();
        CorefieldsFactory.eINSTANCE.eClass();
    }

    public static void savePackage(Package pkg, OutputStream target) throws IOException {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("chub", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI("imported.chub"));
        resource.getContents().add(pkg);

        resource.save(target, Collections.EMPTY_MAP);
    }
}
