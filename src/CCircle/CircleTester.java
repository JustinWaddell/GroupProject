package CCircle;

public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        double radius = c1.getRadius();
        System.out.println(radius);

        c1.setRadius(6.0);
        System.out.println(c1.getRadius());
        double area = c1.area();
        System.out.println(area);
        System.out.println(c1);

        Circle c2 = new Circle(7.8);
    }
}
