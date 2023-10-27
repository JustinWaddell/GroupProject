package Homework.Chapter5;
/**
 * class: ExerciseGetString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.7 :This program is used to print a string without a static method
 */
import java.util.Scanner;
public class ExerciseGetString {

    public void getString(String str){
        System.out.println(str);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write something below");
        String str = input.nextLine();
        ExerciseGetString exp = new ExerciseGetString();
        exp.getString(str);
    }

}
