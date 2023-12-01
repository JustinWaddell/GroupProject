package GroupProject;
/**
 * class: PrintOdd2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 4.	Since there is an asteroid coming to destroy the earth the only one who can save it is you.
 * The only thing you must do is create an instance method that tells you if a number chosen by the user is odd.
 */

import java.util.Scanner;

public class PrintOdd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is odd.");
        int num = input.nextInt();
        PrintOdd2 exp = new PrintOdd2();
        exp.IsOdd(num);
    }
    public void IsOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("The number is odd");;
        }

    }
}
