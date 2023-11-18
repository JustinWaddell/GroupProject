package Homework.Chapter7;
/**
 * class: SchoolClass
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 17, 2023
 * Description: 5.12.8 :This program is used to see which students are oldest and youngest using an arraylist of
 * students and the information coming from the student class.
 */
import java.util.ArrayList;

public class SchoolClass {
    ArrayList<StudentClass> student;

    public SchoolClass() { student = new ArrayList<>();
    }

    public void addStudent(StudentClass astud){
        student.add(astud);
    }
    public void removeStudent(StudentClass rstud) {
        student.remove(rstud);
    }
    public StudentClass findYoungestStudent(){
        int minAge = Integer.MAX_VALUE;
        StudentClass youngest = null;
        for (StudentClass find:student){
            if(find.getAge() < minAge){
                minAge = find.getAge();
                youngest = find;
            }
        }
        return youngest;

    }
    public StudentClass findOldestStudent(){
        int maxAge = Integer.MIN_VALUE;
        StudentClass oldest = null;
        for(StudentClass find:student){
            if(find.getAge() > maxAge){
                maxAge = find.getAge();
                oldest = find;
            }
        }
        return oldest;
    }

}
