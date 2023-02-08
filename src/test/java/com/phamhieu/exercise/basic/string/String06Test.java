package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String06Test {

    @Test
    void verifyNumberBarcodeEan() {
        final var test = new String06();
        assertEquals(4, test.verifyNumberBarcodeEan("893850597419"));
    }
}