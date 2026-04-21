package org.example.solidprinciple.ISP;

interface TwoDimentionalShape{
    double area();
}

interface ThreeDimentionalShape extends TwoDimentionalShape{
    double volume();
}

class SqaureShape implements TwoDimentionalShape{
    private double side;

    public SqaureShape(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class RectangleShape implements TwoDimentionalShape{
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class CubeShape implements ThreeDimentionalShape{
    private double side;

    public CubeShape(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}


public class ISPFollowed {

    public static void main(String[] args) {
        TwoDimentionalShape square = new SqaureShape(4);
        System.out.println("Area of square: " + square.area());

        TwoDimentionalShape rectangle = new RectangleShape(5, 3);
        System.out.println("Area of rectangle: " + rectangle.area());

        ThreeDimentionalShape cube = new CubeShape(2);
        System.out.println("Area of cube: " + cube.area());
        System.out.println("Volume of cube: " + cube.volume());
    }
}
