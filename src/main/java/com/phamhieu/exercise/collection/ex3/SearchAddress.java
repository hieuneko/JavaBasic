package com.phamhieu.exercise.collection.ex3;

import com.phamhieu.exercise.collection.ex1.VietnameseAddress;

import java.io.IOException;
import java.util.Set;

import static com.phamhieu.exercise.collection.ex2.ParseJson.getCommuneString;
import static com.phamhieu.exercise.collection.ex2.ParseJson.parseJson;
import static java.util.stream.Collectors.toSet;

public class SearchAddress {

    public Set<String> searchAddress(final String input) throws IOException {
        final var vietnameseObject = parseJson(VietnameseAddress.class, "address.json");
        return vietnameseObject.getCommunes().stream()
                .filter(commune -> commune.getName().contains(input))
                .map(commune -> getCommuneString(commune, vietnameseObject.getDistricts(), vietnameseObject.getProvinces()))
                .collect(toSet());
    }
}
