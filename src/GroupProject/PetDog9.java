package GroupProject;
/**
 * class: PetDog9
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 1:Create a class that involves creating your own pet dog. Using these instance variables:
 * Name
 * Breed
 * Age(number)
 *
 * 2.create a no argument constructor
 * 3.  Create the constructors for that takes name , type, and ,age as arguments :
 * 4. create the getter and setters and toString.
 */
public class PetDog9 {
    private String Name;
    private String Breed;
    private int Age;

    public PetDog9(String name, String breed, int age) {
        this.Name = name;
        this.Breed = breed;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        this.Breed = breed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String toString() {
        return "The dog's name is " + Name + ", the dog's breed is ,"  + Breed + ", and finally the age is "  + Age;
    }
}
