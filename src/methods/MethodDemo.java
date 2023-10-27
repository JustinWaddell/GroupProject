package methods;

public class MethodDemo {
    public static void main(String[] args) {
        //this is how to call a static/class method.
        MethodDemo.doSomething2();//if you are calling this method from inside or outside of the class
        doSomething2();//if you are calling this method inside of the class

        //how to call instance method
        //1. create an object based on the class where defined an instance/non-static method.
        MethodDemo Lilith = new MethodDemo();
        //Lilith is the reference variable name
        //lilith is not an object or an instance but a reference variable name.

        //call or invoke the instance or nonstatic method from the object you create above
        Lilith.doSomething();

        MethodDemo Sam = new MethodDemo();
        Sam.doSomething();

        MethodDemo Alice = new MethodDemo();
        Alice.doSomething();
    }

    //non-static method is also called instance method
    public void doSomething(){
        System.out.println("doSomething() is called");
    }
    //Static/class method - belongs to a class where the method is defined
    public static void doSomething2(){
        System.out.println("doSomething2() method is called");
    }
}
