package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc09Test {

    @Test
    void findSquareRoot() {
        final var test = new Sohoc09();
        assertEquals(0, test.findSquareRoot(0));
        assertEquals(25.000000, test.findSquareRoot(625));
        assertEquals(3.464102, test.findSquareRoot(12));
    }
}