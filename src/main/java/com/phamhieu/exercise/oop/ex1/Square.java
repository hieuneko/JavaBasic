package com.phamhieu.exercise.oop.ex1;

public class Square extends Rectangle {
    public Square(final Point top_right, final double side) {
        super(top_right, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(final double side) {
        setWidth(side);
        setHeight(side);
    }
}
