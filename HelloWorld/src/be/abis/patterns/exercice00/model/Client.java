package be.abis.patterns.exercice00.model;

public class Client {

    public static void main(String[] args) {

        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle(2.0, 4.0);
        shapeList[1] = new Circle(5.0);

        printShapeDetails(shapeList);

    }
    private static void printShapeDetails(Shape[] list) {
        for (Shape shape : list) {
            double area = shape.area();
            System.out.println("Area: " + area);
        }
    }
}


