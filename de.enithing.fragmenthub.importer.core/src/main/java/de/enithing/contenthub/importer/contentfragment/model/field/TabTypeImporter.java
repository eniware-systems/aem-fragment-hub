package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.SimpleFieldType;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tab;

import org.eclipse.emf.common.util.EList;

import java.util.ArrayList;
import java.util.List;

public class TabTypeImporter extends ContentFragmentFieldTypeImporter<Tab> {
    public TabTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Tab createElement() throws Exception {
        Tab field = CorefieldsFactory.eINSTANCE.createTab();
        setFieldDefaults(field);
        return field;
    }

    @Override
    public void onPostImportPackage(ContentFragmentFieldType<?> field) throws Exception {
        // Regroup the fields
        Tab tab = (Tab) field;
        List<SimpleFieldType<?>> children = new ArrayList<>();

        var fields = field.getModel().getFields();

        for (int i = fields.indexOf(field) + 1; i < fields.size(); ++i) {
            ContentFragmentFieldType<?> f = fields.get(i);

            if (!(f instanceof SimpleFieldType<?> s)) {
                break;
            }

            children.add(s);
        }

        for (SimpleFieldType<?> child : children) {
            field.getModel().getFields().remove(child);
            tab.getFields().add(child);
        }

        getLogger().info(String.format("Grouped %s fields under the '%s' tab", children.size(), tab.getFieldLabel()));

        super.onPostImportPackage(field);
    }
}