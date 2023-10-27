package Homework.Chapter5;
/**
 * class: Exercise2ReadaString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.2 :This program is used to repeat a string inputted by the user using a class method.
 */
import java.util.Scanner;

public class Exercise2ReadaString {
    public static String Justin(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string for the program");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String result = Justin();
        System.out.println(result);
    }
}
