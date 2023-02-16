package com.phamhieu.exercise.collection.ex2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseJsonTest {

    @Test
    void parseJson() throws IOException {
        final var parseObject = new ParseJson();
        final var vietnameseObject = parseObject.parseJson("address.json");
        assertEquals("01", vietnameseObject.getProvinces().get(0).getIdProvince());
        assertEquals("Thành phố Đà Nẵng", vietnameseObject.getProvinces().get(3).getName());
    }
}