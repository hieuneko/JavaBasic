package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangle() {
        final var test = new Rectangle(new Point(6, 4), 5, 3);
        Rectangle rectangle = new Rectangle(test);
        rectangle.setTopRight(new Point(4, 7));
        rectangle.setWidth(4);
        rectangle.setHeight(7);

        assertEquals(4, rectangle.getTopRight().getX());
        assertEquals(7, rectangle.getTopRight().getY());
        assertEquals(4, rectangle.getWidth());
        assertEquals(7, rectangle.getHeight());
    }

    @Test
    void getArea() {
        final var test = new Rectangle(new Point(6, 4), 5, 3);
        assertEquals(15, test.getArea());
    }

    @Test
    void getPerimeter() {
        final var test = new Rectangle(new Point(6, 4), 5, 3);
        assertEquals(16, test.getPerimeter());
    }

    @Test
    void contains() {
        final var test = new Rectangle(new Point(6, 4), 5, 3);
        assertTrue(test.contains(new Point(2, 3)));
        assertFalse(test.contains(new Point(8, 1)));
    }
}