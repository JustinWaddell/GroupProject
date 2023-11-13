package Movie.Person;

import Person.Person;

import java.util.ArrayList;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }


    }
    class Agetester {
   /* public static int [] oldestAge(ArrayList<Person2> list) {
        int maxValue = 0;
        // for(int i : list){

    }*/
        public static void main(String[] args) {
            ArrayList<Person2> list = new ArrayList<>();
            Person2 p1 = new Person2("Alice", 34);
            list.add(p1);

            list.add(new Person2("Sam", 100));
            list.add(new Person2("Sultan", 102));
            list.add(new Person2("Nicholas", 85));

            //oldestAge(list);

        }
    }



