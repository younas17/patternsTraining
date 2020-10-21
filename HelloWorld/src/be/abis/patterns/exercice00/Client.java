package be.abis.patterns.exercice00;

public class Client {

    public static void main(String[] args) {

        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(2.0, 4.0); // Upcasting

        System.out.println("circle.perimeter = " + c.perimeter());
        System.out.println("circle.area = " + c.area());

        System.out.println("rectangle.perimeter = " + r.perimeter());
        System.out.println("rectangle.area = " + r.area());

    }
}
