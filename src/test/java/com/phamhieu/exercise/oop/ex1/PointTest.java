package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getX() {
        final Point point = new Point(2, 3);
        assertEquals(2, point.getX());
    }

    @Test
    void setX() {
        final Point point = new Point(2, 3);
        point.setX(3);
    }

    @Test
    void getY() {
        final Point point = new Point(2, 3);
        assertEquals(3, point.getY());
    }

    @Test
    void setY() {
        final Point point = new Point(2, 3);
        point.setY(4);
    }
}