package be.abis.patterns.exercice00;

public class Client {

    public static void main(String[] args) {

        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle(2.0, 4.0);
        shapeList[1] = new Circle(5.0);

        ShapeUtil.printShapeDetails(shapeList);

    }
}


