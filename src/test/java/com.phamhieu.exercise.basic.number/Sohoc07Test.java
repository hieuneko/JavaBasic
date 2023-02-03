package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Sohoc07Test {

    @Test
    void checkArmstrongNumber() {
        final var test = new Sohoc07();

        assertFalse(test.checkArmstrongNumber(0));
        assertFalse(test.checkArmstrongNumber(100000));
        assertFalse(test.checkArmstrongNumber(-2));
        assertFalse(test.checkArmstrongNumber(1234));

        assertTrue(test.checkArmstrongNumber(8208));
    }
}