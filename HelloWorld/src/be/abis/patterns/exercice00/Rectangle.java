package be.abis.patterns.exercice00;

public class Rectangle extends Shape{
private final double height;
private final double width;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double area() {
        return  width * height;
    }


    public double perimeter() {
        return 2.0 * (width + height);
    }
}
