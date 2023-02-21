package com.phamhieu.exercise.collection.ex2;

import com.phamhieu.exercise.collection.ex1.District;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ParseJsonTest {

    @Test
    void parseJson() {
        assertThrows(IOException.class, () -> ParseJson.parseJson(District.class, "address.json"));
    }
}