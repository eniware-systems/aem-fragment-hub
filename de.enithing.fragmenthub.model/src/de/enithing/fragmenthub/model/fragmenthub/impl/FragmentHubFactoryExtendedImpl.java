/**
 *
 */
package de.enithing.fragmenthub.model.fragmenthub.impl;

import java.nio.file.Path;

import org.eclipse.emf.ecore.EDataType;

import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.Package;
import de.enithing.fragmenthub.model.fragmenthub.impl.FragmentHubFactoryImpl;

/**
 * Extensions for the implementation of the model factory
 */
public class FragmentHubFactoryExtendedImpl extends FragmentHubFactoryImpl {
    public FragmentHubFactoryExtendedImpl() {
        setEPackage(FragmentHubPackage.eINSTANCE);
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

} // FragmentHubFactoryImpl
