package com.phamhieu.exercise.collection.ex2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class ParseJsonTest {

    @Test
    void parseJson() throws IOException {
        final var parseObject = new ParseJson();
        final var vietnameseObject = parseObject.parseJson("address.json");
        assertEquals("01", vietnameseAddress.getProvinces().get(0).getIdProvince());
    }
}