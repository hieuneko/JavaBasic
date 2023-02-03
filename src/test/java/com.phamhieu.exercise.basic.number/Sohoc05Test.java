package com.phamhieu.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sohoc05Test {

    @Test
    void findSum() {
        final var test = new Sohoc05();

        assertEquals(0, test.findSum(-2));
        assertEquals(0, test.findSum(0));
        assertEquals(330, test.findSum(9));
    }
}