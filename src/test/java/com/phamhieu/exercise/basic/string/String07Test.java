package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class String07Test {

    @Test
    void checkContainString() {
        final var test = new String07();
        assertFalse(test.checkContainString("", "abc"));
        assertFalse(test.checkContainString("abc", ""));
        assertTrue(test.checkContainString("pham hieu", "hieu"));
    }
}