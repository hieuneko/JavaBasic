package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        final var test = new Circle(new Point(3, 4), 5);
        assertEquals(5, test.getRadius());
    }

    @Test
    void setRadius() {
        final var test = new Circle(new Point(3, 4), 5);
        test.setRadius(6);
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