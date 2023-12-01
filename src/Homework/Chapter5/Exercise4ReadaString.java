package Homework.Chapter5;
/**
 * class: Exercise4ReadaString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.4 :This program is used to repeat a string using an instance method with no
 * parameters.
 */
import java.util.Scanner;

public class Exercise4ReadaString {
private static Scanner input;

    public String readThyString(){
        System.out.println("Please input a string");
        String ans = input.nextLine();
        return ans;
    }

    public static void main(String[] args) {
        Exercise4ReadaString newAns = new Exercise4ReadaString();
        input = new Scanner(System.in);
        String str = newAns.readThyString();
        System.out.println(str);
    }
}
