package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Sohoc09Test {

    @Test
    void findSquareRoot() {
        final var test = new Sohoc09();
        assertEquals(0, test.findSquareRoot(0));
        assertEquals(25D, test.findSquareRoot(625), 0.0001);
        assertEquals(3.464101, test.findSquareRoot(12), 0.0001);
        assertEquals(0.1, test.findSquareRoot(0.01), 0.0001);
        assertEquals(0.5, test.findSquareRoot(0.25), 0.0001);
        assertEquals(0.7071, test.findSquareRoot(0.5), 0.0001);
    }
}