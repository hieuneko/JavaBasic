package com.phamhieu.exercise.oop.ex1;

public class Triangle implements Shape {
    private Point point_1;
    private Point point_2;
    private Point point_3;

    public Triangle(Point point_1, Point point_2, Point point_3) {
        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
    }

    public Triangle(Triangle triangle) {
        this.point_1 = triangle.point_1;
        this.point_2 = triangle.point_2;
        this.point_3 = triangle.point_3;
    }

    public Point getPoint_1() {
        return point_1;
    }

    public void setPoint_1(Point point_1) {
        this.point_1 = point_1;
    }

    public Point getPoint_2() {
        return point_2;
    }

    public void setPoint_2(Point point_2) {
        this.point_2 = point_2;
    }

    public Point getPoint_3() {
        return point_3;
    }

    public void setPoint_3(Point point_3) {
        this.point_3 = point_3;
    }

    @Override
    public double getArea() {
        return Math.abs((point_1.getX() * (point_2.getY() - point_3.getY()) + point_2.getX() * (point_3.getY() - point_1.getY()) + point_3.getX() * (point_1.getY() - point_2.getY())) / 2);
    }

    @Override
    public double getPerimeter() {
        return Math.hypot(point_2.getX() - point_1.getX(), point_2.getY() - point_1.getY()) + Math.hypot(point_3.getX() - point_2.getX(), point_3.getY() - point_2.getY()) + Math.hypot(point_1.getX() - point_3.getX(), point_1.getY() - point_3.getY());
    }

    @Override
    public boolean contains(Point point) {
        double areaTriangle = this.getArea();
        double area_1 = Math.abs((point.getX() * (point_2.getY() - point_3.getY()) + point_2.getX() * (point_3.getY() - point.getY()) + point_3.getX() * (point.getY() - point_2.getY())) / 2.0);
        double area_2 = Math.abs((point_1.getX() * (point.getY() - point_3.getY()) + point.getX() * (point_3.getY() - point_1.getY()) + point_3.getX() * (point_1.getY() - point.getY())) / 2.0);
        double area_3 = Math.abs((point_1.getX() * (point_2.getY() - point.getY()) + point_2.getX() * (point.getY() - point_1.getY()) + point.getX() * (point_1.getY() - point_2.getY())) / 2.0);
        return (areaTriangle == area_1 + area_2 + area_3);
    }
}
