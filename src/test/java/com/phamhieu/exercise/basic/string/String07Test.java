package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String07Test {

    @Test
    void checkContainString() {
        final var test = new String07();
        assertEquals(-1, test.findIndexContainString("", "abc"));
        assertEquals(0, test.findIndexContainString("abc", ""));
        assertEquals(-1, test.findIndexContainString("abc", "d"));
        assertEquals(-1, test.findIndexContainString("abc", "ty"));
        assertEquals(5, test.findIndexContainString("abcdegh", "gh"));
        assertEquals(5, test.findIndexContainString("pham hieu", "hieu"));
    }
}