package Person;

public class PersonTester {
    public static void main(String[] args) {
        Person Lilith = new Person("Lilith", "blue", 21);
        Lilith.talk();

        Person obj = new Person("Sam", "Green", 22);

        obj.talk();
        obj.setName("Emily B.");
        obj.talk();
        int age = obj.getAge();
        System.out.println(", I am " + age + " years old." );

        String name = obj.getName();
        System.out.println("Hello, my name is " + name);
        String eyeColor = obj.getEyeColor();
        System.out.println("My eyes are " + eyeColor);
        int agee = obj.getAge();
        System.out.println(", and I'm " + agee + " years old");

    }
}
