package com.phamhieu.exercise.collection.ex3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchAddressTest {

    @Test
    void searchAddress() throws IOException {
        final var address = new SearchAddress();
        assertTrue(address.searchAddress("Tam").contains("Xã Tam Quang, Huyện Núi Thành, Tỉnh Quảng Nam"));
        assertTrue(address.searchAddress("123").isEmpty());
        assertFalse(address.searchAddress("Tam").contains("Xã Tam Quang, Huyện Mê Linh, Thành phố Hà Nội"));
    }
}