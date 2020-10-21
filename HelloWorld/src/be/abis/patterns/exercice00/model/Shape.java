package be.abis.patterns.exercice00.model;

public abstract class Shape {
    private String color;
    private Point point;

    public Shape() {
    }

    public Shape(String color, Point point) {
        this.color = color;
        this.point = point;
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

    @Override
    public String toString() {
        return "Shape " +this.getClass().getSimpleName()+
                " color is " + this.getColor() + '\'' +
                ", area is " + this.area()
                ;
    }
}
