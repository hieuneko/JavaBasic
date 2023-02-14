package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String07Test {

    @Test
    void checkContainString() {
        final var test = new String07();
        assertEquals(-1, test.checkContainString("", "abc"));
        assertEquals(0, test.checkContainString("abc", ""));
        assertEquals(-1, test.checkContainString("abc", "d"));
        assertEquals(5, test.checkContainString("abcdegh", "gh"));
        assertEquals(5, test.checkContainString("pham hieu", "hieu"));
    }
}