package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testTriangle() {
        final Triangle instanceTest = new Triangle(new Point(1, 1), new Point(6, 1), new Point(4, 6));
        final Triangle triangle = new Triangle(instanceTest);
        triangle.setPoint_1(new Point(2, 3));
        triangle.setPoint_2(new Point(5, 1));
        triangle.setPoint_3(new Point(3, 9));

        assertEquals(2, triangle.getPoint_1().getX());
        assertEquals(3, triangle.getPoint_1().getY());
        assertEquals(5, triangle.getPoint_2().getX());
        assertEquals(1, triangle.getPoint_2().getY());
        assertEquals(3, triangle.getPoint_3().getX());
        assertEquals(9, triangle.getPoint_3().getY());
    }

    @Test
    void getArea() {
        final Triangle triangle = new Triangle(new Point(1, 1), new Point(6, 1), new Point(4, 6));
        assertEquals(12.5, triangle.getArea());
    }

    @Test
    void getPerimeter() {
        final Triangle triangle = new Triangle(new Point(1, 1), new Point(6, 1), new Point(4, 6));
        assertEquals(16.216, triangle.getPerimeter(), 0.001);
    }

    @Test
    void contains() {
        final Triangle triangle = new Triangle(new Point(1, 1), new Point(6, 1), new Point(4, 6));
        assertFalse(triangle.contains(new Point(6, 4)));
        assertTrue(triangle.contains(new Point(4, 3)));
    }
}