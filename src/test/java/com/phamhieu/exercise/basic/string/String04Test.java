package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class String04Test {

    @Test
    void checkDuplicateString() {
        final var test = new String04();
        assertFalse(test.checkDuplicateString(""));
        assertFalse(test.checkDuplicateString("abc"));
        assertTrue(test.checkDuplicateString("abab"));
        assertTrue(test.checkDuplicateString("abrtrgfdfabererab"));
        assertTrue(test.checkDuplicateString("rtrgfdfbabererab"));
    }
}