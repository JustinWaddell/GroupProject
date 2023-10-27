package Homework.Chapter5;
/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.10 :This program is used to see if a number is a prime number using a method.
 */
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a integer.");
        int number = input.nextInt();
        IsPrime exp = new IsPrime();
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
