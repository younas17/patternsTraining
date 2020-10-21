package be.abis.patterns.exercice00.model;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, double width, double height) {
        super(color);
        ;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
