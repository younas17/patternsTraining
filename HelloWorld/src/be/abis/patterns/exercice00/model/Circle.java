package be.abis.patterns.exercice00.model;

public class Circle extends Shape{

    private  double radius;

    public Circle(String color ,double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s.toString();
    }

}
