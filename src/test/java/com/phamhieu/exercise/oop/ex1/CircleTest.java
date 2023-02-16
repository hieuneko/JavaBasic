package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircle() {
        final Circle instanceTest = new Circle(new Point(3, 4), 5);
        final Circle circle = new Circle(instanceTest);
        circle.setCenter(new Point(2, 2));

        assertEquals(2, circle.getCenter().getX());
        assertEquals(2, circle.getCenter().getY());

        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getArea() {
        final Circle circle = new Circle(new Point(3, 4), 5);
        assertEquals(78.5, circle.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        final Circle circle = new Circle(new Point(3, 4), 5);
        assertEquals(31.4, circle.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        final var test = new Circle(new Point(3, 4), 5);
        assertTrue(test.contains(new Point(1, 1)));
        assertFalse(test.contains(new Point(10, 8)));
    }
}