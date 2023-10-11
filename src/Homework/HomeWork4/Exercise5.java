package Homework.HomeWork4;
/**
 * class: Exercise5
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.5 :This program is used to find the factorial of a number inserted by a user.
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer value.");
        int n = input.nextInt();
        int np = 1;
        for (int i = 1; i <= n; i++){
            np = np * i;
        }
        System.out.println("The factorial of the number you submitted is " +np);
    }
}
