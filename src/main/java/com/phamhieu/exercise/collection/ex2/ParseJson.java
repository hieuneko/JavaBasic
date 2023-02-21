package com.phamhieu.exercise.collection.ex2;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class ParseJson {

    public static <T> T parseJson(final Class<T> targetClass, final String fileName) throws IOException {
        ClassLoader classLoader = ParseJson.class.getClassLoader();
        InputStream file = classLoader.getResourceAsStream(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, targetClass);
    }
}
