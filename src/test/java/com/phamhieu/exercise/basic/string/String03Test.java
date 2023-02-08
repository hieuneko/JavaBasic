package com.phamhieu.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String03Test {

    @Test
    void findSumNumberInString() {
        final var test = new String03();
        assertEquals(0, test.findSumNumberInString(""));
        assertEquals(380, test.findSumNumberInString("abc 123 def 33 mn 3.221"));
    }
}