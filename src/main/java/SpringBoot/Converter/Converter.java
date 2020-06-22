package SpringBoot.Converter;

import java.lang.reflect.Field;

public class Converter {
    public <E, B> Object toDTO(E entity, B dtoBuilder) throws IllegalAccessException {
        Class<E> entityClass = (Class<E>) entity.getClass();
        Class<B> builderClass = (Class<B>) dtoBuilder.getClass();
        for (Field i : entityClass.getDeclaredFields()) {
            i.setAccessible(true);
            if ((i.get(entity) instanceof String) || (i.get(entity) instanceof Integer) || i.getType().getSimpleName().equals("int")) {
                String fieldName1 = i.getName();
                if (fieldName1.endsWith("_"))
                    fieldName1 = fieldName1.substring(0, fieldName1.length() - 1);
                for (Field j : builderClass.getDeclaredFields()) {
                    j.setAccessible(true);
                    if ((j.get(dtoBuilder) instanceof String) || (j.get(dtoBuilder) instanceof Integer) || j.getType().getSimpleName().equals("int") || j.getType().getSimpleName().equals("String") || j.getType().getSimpleName().equals("Integer")) {
                        String fieldName2 = j.getName();
                        if (fieldName2.endsWith("_"))
                            fieldName2 = fieldName2.substring(0, fieldName2.length() - 1);
                        if (fieldName1.equals(fieldName2)) {
                            j.set(dtoBuilder, i.get(entity));
                        }
                    }

                }
            }

        }
        return dtoBuilder;
    }

}
