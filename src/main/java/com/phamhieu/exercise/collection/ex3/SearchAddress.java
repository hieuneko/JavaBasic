package com.phamhieu.exercise.collection.ex3;

import com.phamhieu.exercise.collection.ex2.ParseJson;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SearchAddress {

    public Set<String> searchAddress(final String input) throws IOException {
        final var parseObject = new ParseJson();
        final var vietnameseObject = parseObject.parseJson("src/main/resources/address.json");
        Set<String> addressList = new HashSet<>();
        
        return addressList;
    }
}
