package Dog;

public class DogTester {
    public static void main(String[] args) {
        Dog Chloe =new Dog();
        Chloe.write();
        Chloe.setName("Chloe");
        Chloe.write();
        Chloe.setBreed("Poodle");
        Chloe.write();




        Dog rocky = new Dog("Rocky", "Rottweiler", 5);

        System.out.println(rocky);
    }
}
