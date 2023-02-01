package com.phamhieu.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void setUp() {
        final var javaSample = new Demo();

        assertEquals(5, javaSample.demo(2, 3));
        assertEquals(7, javaSample.demo(4, 3));
    }
}