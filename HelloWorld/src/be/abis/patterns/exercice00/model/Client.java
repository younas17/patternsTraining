package be.abis.patterns.exercice00.model;

public class Client {

    public static void main(String[] args) {

        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle("red",2.0, 4.0);
        shapeList[1] = new Circle("black",5.0);

        for (Shape shape : shapeList) {
            System.out.println(shape);
        }

    }

}


