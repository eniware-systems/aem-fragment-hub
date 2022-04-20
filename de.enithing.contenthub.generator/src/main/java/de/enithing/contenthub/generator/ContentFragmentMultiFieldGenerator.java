package de.enithing.contenthub.generator;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.model.contentfragment.MultiFieldType;

public abstract class ContentFragmentMultiFieldGenerator<TField extends MultiFieldType<?>> extends ContentFragmentFieldGenerator<TField> {

	public ContentFragmentMultiFieldGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}
	
	private void populateDefaultFieldAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("jcr:primaryType", "nt:unstructured");
		attribs.put("name", element.getPropertyName());
		attribs.put("renderReadOnly", false);
		attribs.put("sling:resourceType", getResourceType());
		
		@SuppressWarnings("unchecked")
		Map<String, String> baseAttribs = (Map<String, String>) ctx.get("attribs");
		
		for(String key : getAllSharedFieldAttribs()) {
			if(baseAttribs.containsKey(key)) {
				String attrib = baseAttribs.get(key);
				attribs.put(key, attrib);
			}
		}
	}
	
	@Override
	final protected void populateDefaultAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) { 
		super.populateDefaultAttribs(element, ctx, attribs);
		
		attribs.put("sling:resourceType", element.isAllowMultiple() ? getMultiResourceType() : getResourceType());
	}
	
	@Override
	final protected void populateDefaultGraniteAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
		// TODO Auto-generated method stub
		super.populateDefaultGraniteAttribs(element, ctx, attribs);
		if(element.isAllowMultiple() && element.getMaxItems() > 0) {
			attribs.put("mvmaxitems", element.getMaxItems());
		}
	}
	
	public void populateFieldAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {}
	
	public void populateFieldGraniteAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {}
	
	private void populateDefaultFieldGraniteAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("jcr:primaryType", "nt:unstructured");
		if(element.getMaxItems() > 0) {
			attribs.put("mvmaxitems", element.getMaxItems());
		}
	}
	
	public abstract void getSharedFieldAttribs(Set<String> attribs);
	
	private Set<String> getAllSharedFieldAttribs() {
		HashSet<String> results = new HashSet<>();
		results.add("name");
		results.add("renderReadOnly");
		
		getSharedFieldAttribs(results);
		
		return results;
	}
	
	public abstract String getMultiResourceType();
	
	@Override
	public void populateTemplateContext(TField element, VelocityContext ctx) throws IOException, ParseException {
		// TODO Auto-generated method stub
		super.populateTemplateContext(element, ctx);
				
		MultiFieldType<?> multiField = (MultiFieldType<?>) element;
		
		ctx.put("isMultifield", multiField.isAllowMultiple());
		
		if(!multiField.isAllowMultiple()) {
			return;
		}
		
		{
			Map<String, Object> attribs = new HashMap<>();
	
			populateDefaultFieldAttribs(element, ctx, attribs);
			populateFieldAttribs(element, ctx, attribs);
				
			Map<String, String> convertedAttribs = new HashMap<>();
	
			convertAttribs(attribs, convertedAttribs, null);
				
			ctx.put("fieldAttribs", convertedAttribs);
		}
		
		{
			Map<String, Object> attribs = new HashMap<>();
	
			populateDefaultFieldGraniteAttribs(element, ctx, attribs);
			populateFieldGraniteAttribs(element, ctx, attribs);
	
			Map<String, String> convertedAttribs = new HashMap<>();
	
			convertAttribs(attribs, convertedAttribs, null);
	
			ctx.put("fieldGraniteAttribs", convertedAttribs);
		}
	}
	
	
}
