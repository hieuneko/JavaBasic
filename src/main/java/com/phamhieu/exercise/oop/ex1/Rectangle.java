package com.phamhieu.exercise.oop.ex1;

public class Rectangle implements Shape {
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(final Point topLeft, final double width, final double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(final Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
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
        if (!(point.getX() <= (topLeft.getX() + width) && point.getX() >= topLeft.getX())) {
            return false;
        }
        return point.getY() <= (topLeft.getY() + height) && point.getY() >= topLeft.getY();
    }
}
