package Homework.HomeWork4;
/**
 * class: Exercise6
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 11, 2023
 * Description: 4.11.6 :This program is used to display the sum of digits of an integer the user inputs.
 */
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter a integer to display the some of the digits");
        int integer = input.nextInt();
        int sum = 0;
        while(integer != 0) {
            sum = sum + integer % 10;
            integer = integer / 10;
        }
        System.out.println(sum);
    }
}
