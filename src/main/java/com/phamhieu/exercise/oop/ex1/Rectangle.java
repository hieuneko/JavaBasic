package com.phamhieu.exercise.oop.ex1;

public class Rectangle implements Shape {
    private Point bottom_left;
    private Point top_right;
    private double width;
    private double height;

    public Rectangle(Point bottom_left, Point top_right, double width, double height) {
        this.bottom_left = bottom_left;
        this.top_right = top_right;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.bottom_left = rectangle.bottom_left;
        this.top_right = rectangle.top_right;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Point getBottom_left() {
        return bottom_left;
    }

    public void setBottom_left(Point bottom_left) {
        this.bottom_left = bottom_left;
    }

    public Point getTop_right() {
        return top_right;
    }

    public void setTop_right(Point top_right) {
        this.top_right = top_right;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public boolean contains(Point point) {
        if (point.getX() > bottom_left.getX() && point.getX() < top_right.getX() && point.getY() > bottom_left.getY() && point.getY() < top_right.getY()) {
            return true;
        }
        return false;
    }
}
