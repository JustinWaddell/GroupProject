package Homework.Chapter7;

public class StudentClass {
    private String id;
    private int age;
    private double gpa;
    private int creditsHours;

    public StudentClass (String id, int age, double gpa, int creditsHours){
        this.id = id;
        this.age=age;
        this.gpa=gpa;
        this.creditsHours=creditsHours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditsHours() {
        return creditsHours;
    }

    public void setCreditsHours(int creditsHours) {
        this.creditsHours = creditsHours;
    }
    @Override
    public boolean equals(Object o) {
        if ( this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass student = (StudentClass) o;
        return id == student.id;
    }

    @Override
    public String toString () {
        return "The student's id is " + id;
    }
}
