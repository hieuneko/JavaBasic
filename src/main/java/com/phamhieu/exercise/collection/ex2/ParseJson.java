package com.phamhieu.exercise.collection.ex2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phamhieu.exercise.collection.ex1.Commune;
import com.phamhieu.exercise.collection.ex1.District;
import com.phamhieu.exercise.collection.ex1.Province;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@UtilityClass
public class ParseJson {

    public static <T> T parseJson(final Class<T> targetClass, final String fileName) throws IOException {
        ClassLoader classLoader = ParseJson.class.getClassLoader();
        InputStream file = classLoader.getResourceAsStream(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, targetClass);
    }

    public static String getCommuneString(Commune commune, List<District> districts, List<Province> provinces) {
        return commune.getName() + ", " + districts.stream().filter(x -> x.getIdDistrict().equals(commune.getIdDistrict())).findFirst().map(x -> getDistrictString(x, provinces)).orElse(null);
    }

    public static String getDistrictString(District district, List<Province> provinces) {
        return district.getName() + ", " + provinces.stream().filter(x -> x.getIdProvince().equals(district.getIdProvince())).findFirst().map(Province::getName).orElse(null);
    }
}
