package org.example.solidprinciple.ISP;

interface Shape{
    double area();
    double volume();
}

class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume() {// Breaking interface segregation principle as Square does not have volume but we are forced to implement it because of the interface contract
        throw new UnsupportedOperationException("Volume is not applicable for a square");
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double volume() {// Breaking interface segregation principle as Rectangle does not have volume but we are forced to implement it because of the interface contract
        throw new UnsupportedOperationException("Volume is not applicable for a rectangle");
    }
}

class Cube implements Shape{
    private double side;

    public Cube(double side) {
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



public class ISPVoilated {
    public static void main(String[] args) {
        Shape square = new Square(4);
        System.out.println("Area of square: " + square.area());
        // System.out.println("Volume of square: " + square.volume()); // This will throw UnsupportedOperationException

        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rectangle.area());
        // System.out.println("Volume of rectangle: " + rectangle.volume()); // This will throw UnsupportedOperationException

        Shape cube = new Cube(2);
        System.out.println("Area of cube: " + cube.area());
        System.out.println("Volume of cube: " + cube.volume());
    }
}
