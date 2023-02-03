package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc06Test {

    @Test
    void findSquareRoot() {
        final var test = new Sohoc06();
        assertEquals(1, test.findSquareRoot(1));
        assertEquals(7.071068, test.findSquareRoot(50));
    }
}