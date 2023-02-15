package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void testSquare() {
        final Square instanceTest = new Square(new Point(4, 4), 3);
        final Square square = new Square(instanceTest);
        square.setSide(4);
        assertEquals(4, square.getSide());
    }
}