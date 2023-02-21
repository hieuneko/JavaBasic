package com.phamhieu.exercise.oop.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {


    final Point point = new Point(2, 3);


    @Test
    void getX() {
        assertEquals(2, point.getX());
    }


    @Test
    void setX() {
        point.setX(3);
    }


    @Test
    void getY() {
        assertEquals(3, point.getY());
    }


    @Test
    void setY() {
        point.setY(4);
    }
}