package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class String05Test {

    @Test
    void checkBarcodeEan13() {
        final var test = new String05();
        assertFalse(test.checkBarcodeEan13("8938505974195"));
        assertFalse(test.checkBarcodeEan13("8938505974194"));
    }
}