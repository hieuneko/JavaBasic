package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircle() {
        final var test = new Circle(new Point(3, 4), 5);
        Circle circle_1 = new Circle(test);
        circle_1.setCenter(new Point(2, 2));

        assertEquals(2, circle_1.getCenter().getX());
        assertEquals(2, circle_1.getCenter().getY());

        circle_1.setRadius(10);
        assertEquals(10, circle_1.getRadius());
    }

    @Test
    void getArea() {
        final var test = new Circle(new Point(3, 4), 5);
        assertEquals(78.5, test.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        final var test = new Circle(new Point(3, 4), 5);
        assertEquals(31.4, test.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        final var test = new Circle(new Point(3, 4), 5);
        assertTrue(test.contains(new Point(1, 1)));
        assertFalse(test.contains(new Point(10, 8)));
    }
}