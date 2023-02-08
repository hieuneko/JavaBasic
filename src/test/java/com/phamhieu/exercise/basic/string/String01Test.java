package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String01Test {

    @Test
    void findReverseString() {
        final var test = new String01();
        assertEquals("", test.findReverseString(""));
        assertEquals("asdfghjkl", test.findReverseString("lkjhgfdsa"));
        assertEquals("cac oahc", test.findReverseString("chao cac"));
    }
}