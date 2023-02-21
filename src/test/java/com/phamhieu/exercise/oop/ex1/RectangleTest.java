package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
    void testRectangle() {
        final Rectangle rectangle = new Rectangle(new Point(6, 4), 5, 3);
        rectangle.setTopLeft(new Point(4, 7));
        rectangle.setWidth(4);
        rectangle.setHeight(7);


        assertEquals(4, rectangle.getTopLeft().getX());
        assertEquals(7, rectangle.getTopLeft().getY());
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
        final Rectangle rectangle = new Rectangle(new Point(1, 2), 5, 3);
        assertTrue(rectangle.contains(new Point(2, 3)));
        assertFalse(rectangle.contains(new Point(4, 0)));
        assertFalse(rectangle.contains(new Point(0, 0)));
        assertFalse(rectangle.contains(new Point(7, 3)));
        assertFalse(rectangle.contains(new Point(0, 4)));
        assertFalse(rectangle.contains(new Point(7, 6)));
        assertFalse(rectangle.contains(new Point(3, 6)));
    }
}