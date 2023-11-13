package Person;

public class Person {
    private String name;
    private String eyeColor;
    private int age;
    public Person(String name, String eyeColor, int age){
        this.age = age;
        this.name = name;
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public String getEyeColor(){
        return eyeColor;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){

        this.age = age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    //toString
    @Override
    public String toString(){
        return "From Person class: Name:  " + name + ", Age: " + age + ", Eye Color: " + eyeColor;
    }

    //talk()
    public void talk(){
        System.out.println("\nHello, My name is " + name );
    }
}
