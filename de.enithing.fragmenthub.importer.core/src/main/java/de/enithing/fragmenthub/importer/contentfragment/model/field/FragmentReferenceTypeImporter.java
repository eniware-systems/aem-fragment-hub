package de.enithing.fragmenthub.importer.contentfragment.model.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.importer.util.PathUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentModelImpl;
import de.enithing.fragmenthub.model.fragmenthub.ContentHubFactory;
import de.enithing.fragmenthub.model.fragmenthub.Package;
import de.enithing.fragmenthub.model.fragmenthub.SimplePath;

import org.jdom2.Element;

import java.nio.file.Path;
import java.util.List;

public class FragmentReferenceTypeImporter extends ContentFragmentFieldTypeImporter<FragmentReference> {
    public FragmentReferenceTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    private static class AllowedModelPlaceholder extends ContentFragmentModelImpl {
        private final Path path;

        private AllowedModelPlaceholder(Path path) {
            this.path = path;
        }

        public Path getPath() {
            return path;
        }
    }

    @Override
    public FragmentReference createElement() throws Exception {
        FragmentReference field = CorefieldsFactory.eINSTANCE.createFragmentReference();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setAllowMultiple(JcrUtils.getXmlAttributeBool(node, "isMultifield"));

        // Store the paths in placeholders for resolving in post import
        field.getAllowedModels().addAll(JcrUtils.fromArray(JcrUtils.getXmlAttribute(node, "fragmentmodelreference").getValue())
                .stream()
                .map(Path::of)
                .map(AllowedModelPlaceholder::new)
                .toList());

        field.setAllowFragmentCreation(JcrUtils.getXmlAttributeBool(node, "allowNew"));
        field.setAllowFragmentCreation(JcrUtils.getXmlAttributeBool(node, "required"));

        SimplePath path = ContentHubFactory.eINSTANCE.createSimplePath();
        path.setPath(Path.of(JcrUtils.getXmlAttribute(node, "rootPath").getValue()));
        field.setRootPath(path);

        return field;
    }

    @Override
    public void onPostImportPackage(ContentFragmentFieldType<?> field) throws Exception {
        FragmentReference ref = (FragmentReference) field;
        Package pkg = field.getModel().getModelSet().getPackage();

        List<Path> modelPaths = ref.getAllowedModels().stream().map(m -> (AllowedModelPlaceholder) m).map(m -> m.path).toList();
        ref.getAllowedModels().clear();

        for (Path path : modelPaths) {
            ContentFragmentModel mdl;

            if (getConfig().fragmentModelResolution == ImporterConfiguration.ReferenceResolutionMode.MatchInPackage) {
                Path packagePath = PathUtils.replacePackageName(path, "$packageName");

                mdl = pkg.getAllContentFragmentModels().stream()
                        .filter(i -> i.getPath().equals(packagePath))
                        .findFirst().orElse(null);
            } else {
                mdl = pkg.getAllContentFragmentModels().stream()
                        .filter(i -> i.getPath().equals(path))
                        .findFirst().orElse(null);
            }

            if (mdl == null) {
                getLogger().warning(String.format("Could not resolve content fragment model reference @%s", path));
            } else {
                ref.getAllowedModels().add(mdl);
            }
        }

        super.onPostImportPackage(field);
    }
}