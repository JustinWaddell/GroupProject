package Homework.Chapter5;
/**
 * class: Exercise3ReadaString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.3:This program is used to repeat the string with a static method with Scanner parameter.
 */
import java.util.Scanner;
public class Exercise3ReadaString {
    public static String Stoop(Scanner input){
        System.out.println("please return a string for the program to read.");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        Scanner Lilith = new Scanner(System.in);
        String str = Stoop(Lilith);
        System.out.println(str);
    }
}
