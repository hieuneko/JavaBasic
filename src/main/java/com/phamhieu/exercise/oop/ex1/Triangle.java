package com.phamhieu.exercise.oop.ex1;

public class Triangle implements Shape {
    private Point point_1;
    private Point point_2;
    private Point point_3;

    public Triangle(final Point point_1, final Point point_2, final Point point_3) {
        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
    }

    public Triangle(final Triangle triangle) {
        this.point_1 = triangle.point_1;
        this.point_2 = triangle.point_2;
        this.point_3 = triangle.point_3;
    }

    public Point getPoint_1() {
        return point_1;
    }

    public void setPoint_1(final Point point_1) {
        this.point_1 = point_1;
    }

    public Point getPoint_2() {
        return point_2;
    }

    public void setPoint_2(final Point point_2) {
        this.point_2 = point_2;
    }

    public Point getPoint_3() {
        return point_3;
    }

    public void setPoint_3(final Point point_3) {
        this.point_3 = point_3;
    }

    @Override
    public double getArea() {
        return Math.abs((point_1.getX() * (point_2.getY() - point_3.getY()) + point_2.getX() * (point_3.getY() - point_1.getY()) + point_3.getX() * (point_1.getY() - point_2.getY())) / 2.0);
    }

    @Override
    public double getPerimeter() {
        return Math.hypot(point_2.getX() - point_1.getX(), point_2.getY() - point_1.getY()) + Math.hypot(point_3.getX() - point_2.getX(), point_3.getY() - point_2.getY()) + Math.hypot(point_1.getX() - point_3.getX(), point_1.getY() - point_3.getY());
    }

    @Override
    public boolean contains(final Point point) {
        int side_1 = Multi.checkSidePoint(point_2, point_3, point) * Multi.checkSidePoint(point_2, point_3, point_1);
        int side_2 = Multi.checkSidePoint(point_1, point_3, point) * Multi.checkSidePoint(point_1, point_3, point_2);
        int side_3 = Multi.checkSidePoint(point_1, point_2, point) * Multi.checkSidePoint(point_1, point_2, point_3);
        return side_1 >= 0 && side_2 >= 0 && side_3 >= 0;
    }
}
