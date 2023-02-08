package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class String02Test {

    @Test
    void checkSymmetryString() {
        final var test = new String02();
        assertTrue(test.checkSymmetryString(""));
        assertFalse(test.checkSymmetryString("abcd"));
        assertTrue(test.checkSymmetryString("abcdcba"));
        assertTrue(test.checkSymmetryString("cvbvc"));
    }
}