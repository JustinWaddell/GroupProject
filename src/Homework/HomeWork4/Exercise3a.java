/**
 * class: Exercise3a
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * @written on: October 04, 2023
 * description: 4.11.3-1: This program is used to sum of all even numbers, and
 *  the product of all odd numbers between 1 and a given number.
 */
package Homework.HomeWork4;
import java.util.Scanner;
public class Exercise3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number n: ");

        int n = input.nextInt();
        int sumOfEven = 0;
        int product = 1;
        if (n > 0 && n <= 1000) {
            for (int i = 1; i <= n; i++) {



                    if (i % 2 == 0) {
                        sumOfEven = sumOfEven + i;
                    } else {
                        product *= -i;
                    }

            }
            System.out.println("The sum of the even number is: " + sumOfEven);
            System.out.println("The product of the odd numbers is: " + product);

        } else {
            System.out.println("invalid input; Please try again.");
        }
    }
}



