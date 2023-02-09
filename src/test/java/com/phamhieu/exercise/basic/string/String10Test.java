package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String10Test {

    @Test
    void removeUnneededSpace() {
        final var test = new String10();
        assertEquals("Chao cac ban", test.removeUnneededSpace("  Chao  cac ban "));
    }
}