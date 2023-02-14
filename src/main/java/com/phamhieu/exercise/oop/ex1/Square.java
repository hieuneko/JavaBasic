package com.phamhieu.exercise.oop.ex1;

public class Square extends Rectangle {
    private Point bottom_left;
    private Point top_right;
    private double side;

    public Square(Point bottom_left, Point top_right, double side) {
        super(bottom_left, top_right, side, side);
    }

    public Square(Square square) {
        super(square.bottom_left, square.top_right, square.side, square.side);
    }

    @Override
    public Point getBottom_left() {
        return bottom_left;
    }

    @Override
    public void setBottom_left(Point bottom_left) {
        this.bottom_left = bottom_left;
    }

    @Override
    public Point getTop_right() {
        return top_right;
    }

    @Override
    public void setTop_right(Point top_right) {
        this.top_right = top_right;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
