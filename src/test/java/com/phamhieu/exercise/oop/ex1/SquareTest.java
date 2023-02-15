package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void name() {
        final var test = new Square(new Point(4, 4), 3);
        assertEquals(9, test.getArea());
    }
}