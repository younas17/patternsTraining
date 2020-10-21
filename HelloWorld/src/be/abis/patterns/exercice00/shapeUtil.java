package be.abis.patterns.exercice00;

class ShapeUtil {
    public static void printShapeDetails(Shape[] list) {
        for (int i = 0; i < list.length; i++) {
            double area = list[i].area();
            System.out.println("Area: " + area);
        }
    }
}
