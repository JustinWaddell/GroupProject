package Homework.HomeWork4;
/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.8 :This program is used to see a reversed version of a string value the user inputs.
 */
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed.");
        String str = input.nextLine();
        String reversion = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversion += str.charAt(i);
        }
        System.out.println("This is the reversed string " + reversion);
    }
}
