package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class String08Test {

    @Test
    void checkParentheses() {
        final var test = new String08();
        assertFalse(test.checkParentheses("("));
        assertFalse(test.checkParentheses("()("));
        assertFalse(test.checkParentheses("())())"));
        assertTrue(test.checkParentheses("(((())))()()"));
    }
}