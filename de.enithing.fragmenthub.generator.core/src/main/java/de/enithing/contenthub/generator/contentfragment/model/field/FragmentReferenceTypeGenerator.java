package de.enithing.contenthub.generator.contentfragment.model.field;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;

import org.apache.velocity.VelocityContext;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FragmentReferenceTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<FragmentReference> {

    public FragmentReferenceTypeGenerator(GeneratorConfiguration cfg) {
        super(cfg);
    }

    @Override
    public void populateAttribs(FragmentReference element, VelocityContext ctx, Map<String, Object> attribs) {
        attribs.put("nameSuffix", "contentReference");
        attribs.put("filter", "hierarchy");

        List<Path> allowedModelPaths = element.getAllowedModels().stream()
                .map(mdl -> VelocityUtils.replace(mdl.getPath(), ctx)).collect(Collectors.toList());
        attribs.put("fragmentmodelreference", allowedModelPaths);

        attribs.put("allowNew", element.isAllowFragmentCreation());
        attribs.put("required", JcrUtils.toFlag(element.isRequired()));
        if (element.getRootPath() != null) {
            attribs.put("rootPath", element.getRootPath().getPath().toString());
        }
    }

    @Override
    public void getSharedFieldAttribs(Set<String> attribs) {
        attribs.add("fragmentmodelreference");
    }

    @Override
    public String getMultiResourceType(FragmentReference unused) {
        return "dam/cfm/models/editor/components/fragmentreference/multifield";
    }

    @Override
    public String getResourceType(FragmentReference unused) {
        return "dam/cfm/models/editor/components/fragmentreference";
    }

    @Override
    public String getValueType(FragmentReference unused) {
        return "string/content-fragment";
    }

    @Override
    public String getMetaType(FragmentReference unused) {
        return "fragment-reference";
    }
}
