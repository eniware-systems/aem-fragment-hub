/**
 *
 */
package de.enithing.contenthub.model.contenthub.impl;

import java.nio.file.Path;

import org.eclipse.emf.ecore.EDataType;

import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;

/**
 * Extensions for the implementation of the model factory
 */
public class ContentHubFactoryExtendedImpl extends ContentHubFactoryImpl {
    ContentHubFactoryExtendedImpl() {
        setEPackage(ContentHubPackage.eINSTANCE);
    }

    /**
     * Creates a path from a string. Used for operating with Paths on ECore model
     */
    @Override
    public Path createPathFromString(EDataType eDataType, String initialValue) {
        return Path.of(initialValue);
    }

    @Override
    public Package createPackage() {
        return new ExtendedPackageImpl();
    }

} // ContentHubFactoryImpl
