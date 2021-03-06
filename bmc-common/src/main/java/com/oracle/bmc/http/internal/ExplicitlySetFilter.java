/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

import java.lang.reflect.Field;
import java.util.Set;

public class ExplicitlySetFilter extends SimpleBeanPropertyFilter {
    public static final ExplicitlySetFilter INSTANCE = new ExplicitlySetFilter();
    public static final String NAME = "explicitlySetFilter";
    public static final String FIELD_NAME = "__explicitlySet__";

    private ExplicitlySetFilter() {}

    @Override
    public void serializeAsField(
            Object pojo, JsonGenerator jgen, SerializerProvider provider, PropertyWriter writer)
            throws Exception {
        if (include(writer)) {
            Field field = getDeclaredField(pojo.getClass(), writer.getName());
            boolean accessible = field.isAccessible();
            try {
                field.setAccessible(true);
                Object fieldValue = field.get(pojo);
                if (fieldValue != null) {
                    // not null, definitely serialize
                    writer.serializeAsField(pojo, jgen, provider);
                } else {
                    // null, find out if null was explicitly set
                    Field explicitField = pojo.getClass().getDeclaredField(FIELD_NAME);
                    boolean explicitAccessible = explicitField.isAccessible();
                    try {
                        explicitField.setAccessible(true);
                        Set<String> explicitlySet = (Set<String>) explicitField.get(pojo);
                        if (explicitlySet.contains(writer.getName())) {
                            // explicitly set, serialize
                            writer.serializeAsField(pojo, jgen, provider);
                        }
                    } finally {
                        explicitField.setAccessible(explicitAccessible);
                    }
                }
            } finally {
                field.setAccessible(accessible);
            }
        } else if (!jgen.canOmitFields()) { // since 2.3
            writer.serializeAsOmittedField(pojo, jgen, provider);
        }
    }

    private static Field getDeclaredField(Class<?> pojoClass, String fieldName)
            throws NoSuchFieldException {
        try {
            return pojoClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException nsfe) {
            Class<?> superclass = pojoClass.getSuperclass();
            if (superclass != null) {
                return getDeclaredField(superclass, fieldName);
            } else {
                throw nsfe;
            }
        }
    }

    @Override
    protected boolean include(BeanPropertyWriter writer) {
        return !FIELD_NAME.equals(writer.getName());
    }

    @Override
    protected boolean include(PropertyWriter writer) {
        return !FIELD_NAME.equals(writer.getName());
    }
}
