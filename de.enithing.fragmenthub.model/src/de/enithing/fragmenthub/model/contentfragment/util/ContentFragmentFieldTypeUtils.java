package de.enithing.fragmenthub.model.contentfragment.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EFactory;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.GroupFieldType;

public class ContentFragmentFieldTypeUtils  {
	private ContentFragmentFieldTypeUtils() {
		
	}

	@SuppressWarnings("unchecked")
	public static <TValue extends ContentFragmentFieldValue> TValue createEmptyValue(ContentFragmentFieldType<TValue> fieldType) {
		// This looks up a method called .createTValue() in the factory of the field type.
		// Not a very clean way to get the instance but we have to it in order to retrieve the actual implementation rather
		// than accessing the interface of the value type.
		Class<?> cls= (Class<?>) ((ParameterizedType)fieldType.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
		EFactory factory = fieldType.eClass().getEPackage().getEFactoryInstance();
		
		Method createMethod = Stream.of(factory.getClass().getMethods())
				.filter(m -> m.getName().startsWith("create"))
				.filter(m -> m.getReturnType() == cls)
				.findFirst()
				.orElseThrow()
				;
		
		try {
			return (TValue) createMethod.invoke(factory);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			return null;
		}
	}
	
	public static ContentFragmentModel getModel(ContentFragmentFieldType<?> fieldType) {
		if(fieldType.eContainer() instanceof GroupFieldType<?>) {
			return getModel((ContentFragmentFieldType<?>) fieldType.eContainer());
		}
		
		return (ContentFragmentModel) fieldType.eContainer();
	}
}
