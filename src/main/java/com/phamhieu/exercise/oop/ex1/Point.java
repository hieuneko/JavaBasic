package com.phamhieu.exercise.oop.ex1;

public class Point {
    private int x;
    private int y;


    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public double distance(final Point point) {
        return Math.hypot(point.getX() - this.getX(), point.getY() - this.getY());
    }
}
