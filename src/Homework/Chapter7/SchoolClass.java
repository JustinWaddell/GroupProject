package Homework.Chapter7;

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
