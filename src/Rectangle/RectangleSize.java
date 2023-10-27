package Rectangle;
import java.util.*;
public class RectangleSize {
    private double side1, side2;
    private Scanner input;

    //create a method named getSides()
    //this method is adding two prompts to ask the user enter two doubles: side1 and side2
    public void getSides() {
        System.out.println("Enter Side1: ");
        side1 = input.nextDouble();

        System.out.println("Enter side2: ");
        side2 = input.nextDouble();

    }
        //create getArea() method. this method is returning a double value.
        public double GetArea(){
        return side1 * side2;

    }
    //we will create a method name isLarge and this method will take area of a rectangle as a parameter
    //if the area is greater than 400, then it is a large rectangle
    //otherwise, it is a small rectangle.

    //method name isLarge()
    //parameter is double type area

    public boolean isLarge(double area) {
        boolean large;
        if (area > 400) {
            large = true;
        }
        else {
            large = false;
        }
        return large;
    }
    public void display(boolean large){
        if (large){
            System.out.println("The rectangle is large");
        }
        else {
            System.out.println("The rectangle is small");
        }

    }

    public static void main(String[] args) {
        RectangleSize rObject = new RectangleSize();
        rObject.input = new Scanner(System.in);
        rObject.getSides();
        double area = rObject.GetArea();
        rObject.isLarge(area);
        rObject.display(rObject.isLarge(area));
        rObject.input.close();
    }
}
