package com.phamhieu.exercise.oop.ex1;


import static com.phamhieu.exercise.oop.ex1.Utils.checkSidePoint;

public class Triangle implements Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(final Point point1, final Point point2, final Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(final Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(final Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(final Point point3) {
        this.point3 = point3;
    }

    @Override
    public double getArea() {
        final double halfPerimeter = this.getPerimeter() / 2.0;
        final double edge1 = this.point1.distance(point2);
        final double edge2 = this.point2.distance(point3);
        final double edge3 = this.point3.distance(point1);
        return Math.sqrt(halfPerimeter * (halfPerimeter - edge1) * (halfPerimeter - edge2) * (halfPerimeter - edge3));
    }

    @Override
    public double getPerimeter() {
        return point1.distance(point2) + point2.distance(point3) + point3.distance(point1);
    }

    @Override
    public boolean contains(final Point point) {
        final int side1 = checkSidePoint(point2, point3, point) * checkSidePoint(point2, point3, point1);
        final int side2 = checkSidePoint(point1, point3, point) * checkSidePoint(point1, point3, point2);
        final int side3 = checkSidePoint(point1, point2, point) * checkSidePoint(point1, point2, point3);
        return side1 >= 0 && side2 >= 0 && side3 >= 0;
    }
}
