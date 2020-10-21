package be.abis.patterns.exercice00;

public class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }
}