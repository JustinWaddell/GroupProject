package GroupProject;

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
