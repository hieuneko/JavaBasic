package com.phamhieu.exercise.collection.ex2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phamhieu.exercise.collection.ex1.VietnameseAddress;

import java.io.File;
import java.io.IOException;

public class ParseJson {

    public VietnameseAddress parseJson(final String fileName) throws IOException {
        File file = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        VietnameseAddress vietnameseAddress = objectMapper.readValue(file, VietnameseAddress.class);
        return vietnameseAddress;
    }
}
