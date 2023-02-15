package com.phamhieu.exercise.oop.ex1;

public class Triangle implements Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(final Point point1, final Point point2, final Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(final Triangle triangle) {
        this.point1 = triangle.point1;
        this.point2 = triangle.point2;
        this.point3 = triangle.point3;
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
        return Math.abs((point1.getX() * (point2.getY() - point3.getY()) + point2.getX() * (point3.getY() - point1.getY()) + point3.getX() * (point1.getY() - point2.getY())) / 2.0);
    }

    @Override
    public double getPerimeter() {
        return point1.distance(point2) + point2.distance(point3) + point3.distance(point1);
    }

    @Override
    public boolean contains(final Point point) {
        Multi calculator = new Multi();
        int side_1 = calculator.checkSidePoint(point2, point3, point) * calculator.checkSidePoint(point2, point3, point1);
        int side_2 = calculator.checkSidePoint(point1, point3, point) * calculator.checkSidePoint(point1, point3, point2);
        int side_3 = calculator.checkSidePoint(point1, point2, point) * calculator.checkSidePoint(point1, point2, point3);
        return side_1 >= 0 && side_2 >= 0 && side_3 >= 0;
    }
}
