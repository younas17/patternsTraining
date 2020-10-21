package be.abis.patterns.exercice00.model;

import java.util.List;

public abstract class Shape {
    String color;
    private List<Point> points;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

}
