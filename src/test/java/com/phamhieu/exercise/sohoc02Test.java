package com.phamhieu.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sohoc02Test {
    @Test
    void findTotalDigitsOfNumber() {
        final var test = new sohoc02();

        assertEquals(0, test.findTotalDigitsOfNumber(0));
        assertEquals(10, test.findTotalDigitsOfNumber(1234));
    }
}