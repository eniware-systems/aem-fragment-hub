package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.importer.util.PackageUtils;
import de.enithing.contenthub.importer.util.PathUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentInstanceImpl;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Package;
import org.jdom2.Element;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class FragmentReferenceValueImporter extends ContentFragmentFieldValueImporter<FragmentReferenceValue> {
    public FragmentReferenceValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public FragmentReferenceValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createFragmentReferenceValue();
    }

    private static class ContentFragmentInstancePlaceholder extends ContentFragmentInstanceImpl {
        private final Path path;

        private ContentFragmentInstancePlaceholder(Path path) {
            this.path = path;
        }

        public Path getPath() {
            return path;
        }
    }

    @Override
    public void onEnter(FragmentReferenceValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        Collection<ContentFragmentInstancePlaceholder> placeholders = JcrUtils.fromArray(JcrUtils.getXmlAttribute(node, propertyName).getValue())
                .stream()
                .map(p -> new ContentFragmentInstancePlaceholder(Path.of(p)))
                .toList();

        value.getFragments().addAll(placeholders);
    }

    @Override
    public void onPostImportPackage(ContentFragmentFieldInstance fieldInstance) throws Exception {
        Package pkg = fieldInstance.getFieldtype().getModel().getModelSet().getPackage();

        FragmentReferenceValue value = (FragmentReferenceValue) fieldInstance.getValue();

        List<ContentFragmentInstance> fragments = (value.getFragments().stream().map(f -> {
            ContentFragmentInstancePlaceholder placeholder = (ContentFragmentInstancePlaceholder) f;
            Path path = placeholder.getPath();

            ContentFragmentInstance inst;

            if (getConfig().fragmentReferenceResolution == ImporterConfiguration.ReferenceResolutionMode.MatchInPackage) {
                Path packagePath = PathUtils.replacePackageName(path, "$packageName");

                inst = PackageUtils.getAllContentFragmentInstances(pkg).stream()
                        .filter(i -> i.getPath().equals(packagePath))
                        .findFirst().orElse(null);
            } else {
                inst = PackageUtils.getAllContentFragmentInstances(pkg).stream()
                        .filter(i -> i.getPath().equals(path))
                        .findFirst().orElse(null);
            }

            if(inst == null) {
                getLogger().warning(String.format("Could not resolve content fragment reference @%s", path));
            }

            return inst;
        })).filter(Objects::nonNull).toList();

        value.getFragments().clear();
        value.getFragments().addAll(fragments);

        super.onPostImportPackage(fieldInstance);
    }
}
