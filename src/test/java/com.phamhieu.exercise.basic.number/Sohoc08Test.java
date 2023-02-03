package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc08Test {

    @Test
    void findNumberFromConvert() {
        final var test = new Sohoc08();
        assertEquals(0, test.findNumberFromConvert(0));
        assertEquals(29, test.findNumberFromConvert(23));
    }
}