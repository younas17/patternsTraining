package be.abis.patterns.exercice00;

public abstract class Shape {
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double  area();

    public abstract double perimeter();
}
