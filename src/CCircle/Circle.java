package CCircle;

/**
 * class: Circle
 * Description: This is how to create a program which is a template or a blueprint.
 */
public class Circle {
    //data, field, attribute
    private double radius; //0.0


    //constructor - no argument constructor also known as default constructor
   public Circle(){
        //this.radius = 1.0;
    }
    public Circle(double radius){
       this.radius = radius;
    }

    //getters
    public double getRadius(){
        return radius;
    }



    //setters
    public void setRadius(double radius){
       this.radius = radius;
    }
    public double area(){
       return Math.PI * Math.pow(radius, 2);
    }
    //other method you would need
    // toString
    @Override
    public String toString(){
       return "the area of the circle with radius is " +  getRadius() + "is" + area();


    }




}
