package com.phamhieu.exercise.oop.ex1;

public class Circle implements Shape {
    private Point center;
    private double radius;

    /**
     * create new Circle object with
     *
     * @param center is point at center of circle
     * @param radius is length from center point to circle
     */
    public Circle(final Point center, final double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(final Circle circle) {
        this.center = circle.center;
        this.radius = circle.radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(final Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public boolean contains(final Point point) {
        return Utils.powNumber(point.getX() - center.getX(), 2) + Utils.powNumber(point.getY() - center.getY(), 2) <= (radius * radius);
    }
}
