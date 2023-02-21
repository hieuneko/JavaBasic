package com.phamhieu.exercise.collection.ex2;

import com.phamhieu.exercise.collection.ex1.District;
import com.phamhieu.exercise.collection.ex1.VietnameseAddress;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ParseJsonTest {

    @Test
    void testJson() {
        assertThrows(IOException.class, () -> ParseJson.parseJson(District.class, "address.json"));
    }

    @Test
    void parseJson() throws IOException {
        final var address = ParseJson.parseJson(VietnameseAddress.class, "address.json");
        assertEquals("001", address.getCommunes().get(0).getIdDistrict());
        assertEquals("00001", address.getCommunes().get(0).getIdCommune());
        assertEquals("01", address.getDistricts().get(0).getIdProvince());
    }
}