package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc07Test {

    @Test
    void checkArmstrongNumber() {
        final var test = new Sohoc07();
        assertEquals(false, test.checkArmstrongNumber(0));
        assertEquals(false, test.checkArmstrongNumber(-2));
        assertEquals(true, test.checkArmstrongNumber(8208));
        assertEquals(false,test.checkArmstrongNumber(1234));
    }
}