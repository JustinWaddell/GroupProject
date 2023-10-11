/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.1 :This program is used to see if a number is a prime number.
 */
package Homework.HomeWork4;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer to see if it is a prime number: ");
        int number = input.nextInt();
        boolean isprime = false;

        for(int i = 2; i < number; i++) {
            if (number % i == 0){
                isprime = false;
                break;

            }
        }
        if (isprime) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }



        }
}
