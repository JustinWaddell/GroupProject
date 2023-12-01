package GroupProject;

/**
 * class: Palindrome2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 6.	You have been tasked by the team leader to create an
 * instance method that checks to see if a number is prime
*/

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a integer.");
        int number = input.nextInt();
        Prime2 exp = new Prime2();
        exp.Prime(number);
    }
    public void Prime(int number){
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;
        if (number <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
        }
        if (isPrime){
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " is not prime");
        }
    }
}
