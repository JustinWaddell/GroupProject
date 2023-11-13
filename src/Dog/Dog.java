package Dog;

public class Dog {
    //name, breed, age
    private String name;
    private String breed;
    private int age;


    public Dog(){
        name = "Fido";
        breed = "Chihuahua";
        age = 2;
    }
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setBreed(String b){
        this.breed = b;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void write(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Dog's Age: " + age + " is converted to human age: " + getHumanAge());

    }
    //find a formula to convert the dog's age to human age.
    // dog's age : * 7
    public int getHumanAge (){
        return this.getAge() * 7;
    }
    public String toString(){
        return "////Dog Information\\\\\\\\nName: " + getName() + "\nBreed: " + getBreed() + "\nAge: " +age;
    }
}
