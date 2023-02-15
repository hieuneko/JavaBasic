package com.phamhieu.exercise.oop.ex1;

public class Rectangle implements Shape {
    private Point bottomLeft;
    private Point topRight;
    private double width;
    private double height;

    public Rectangle(final Point topRight, final double width, final double height) {
        this.topRight = topRight;
        this.width = width;
        this.height = height;
    }

    public Rectangle(final Rectangle rectangle) {
        this.topRight = rectangle.topRight;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(final Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(final Point topRight) {
        this.topRight = topRight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
    public boolean contains(final Point point) {
        if (point.getX() > bottomLeft.getX() && point.getX() < topRight.getX() && point.getY() > bottomLeft.getY() && point.getY() < topRight.getY()) {
            return true;
        }
        return false;
    }
}
