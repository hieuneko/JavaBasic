package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getX() {
        final var test = new Point(2, 3);
        assertEquals(2, test.getX());
    }

    @Test
    void setX() {
        final var test = new Point(2, 3);
        test.setX(3);
    }

    @Test
    void getY() {
        final var test = new Point(2, 3);
        assertEquals(3, test.getY());
    }

    @Test
    void setY() {
        final var test = new Point(2, 3);
        test.setY(4);
    }
}