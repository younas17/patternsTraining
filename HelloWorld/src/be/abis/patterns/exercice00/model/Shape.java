package be.abis.patterns.exercice00.model;

import java.util.List;

public abstract class Shape {
    private String color;
    private Point point;

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
