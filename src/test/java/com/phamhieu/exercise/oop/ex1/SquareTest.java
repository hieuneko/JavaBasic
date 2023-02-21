package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Test
    void testSquare() {
        final Square square = new Square(new Point(4, 4), 3);
        square.setSide(4);
        assertEquals(4, square.getSide());
    }


    @Test
    void getArea() {
        final Square square = new Square(new Point(4, 4), 3);
        assertEquals(9, square.getArea());
    }


    @Test
    void getPerimeter() {
        final Square square = new Square(new Point(4, 4), 3);
        assertEquals(12, square.getPerimeter());
    }


    @Test
    void contains() {
        final Square square = new Square(new Point(4, 4), 3);
        assertTrue(square.contains(new Point(3, 3)));
        assertFalse(square.contains(new Point(5, 7)));
    }
}