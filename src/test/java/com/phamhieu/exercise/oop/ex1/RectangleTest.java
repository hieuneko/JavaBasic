package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangle() {
        final Rectangle instanceTest = new Rectangle(new Point(6, 4), 5, 3);
        final Rectangle rectangle = new Rectangle(instanceTest);
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
        final Rectangle rectangle = new Rectangle(new Point(6, 4), 5, 3);
        assertEquals(15, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        final Rectangle rectangle = new Rectangle(new Point(6, 4), 5, 3);
        assertEquals(16, rectangle.getPerimeter());
    }

    @Test
    void contains() {
        final Rectangle rectangle = new Rectangle(new Point(6, 4), 5, 3);
        assertTrue(rectangle.contains(new Point(2, 3)));
        assertFalse(rectangle.contains(new Point(8, 5)));
        assertFalse(rectangle.contains(new Point(0, 0)));
    }
}