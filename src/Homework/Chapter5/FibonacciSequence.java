package Homework.Chapter5;
/**
 * class:
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 5.12.9 :This program is used print a fibonacci sequence as long the user wants and however
 * many times the user wants.
 */
import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the amount of times you the fibonacci sequence to go.");
        int reps = input.nextInt();
        System.out.println("Please input a number for the fibonacci sequence.");
        int fibonacci = input.nextInt();
        for(int i = 0; i < reps; i++){
            FibonacciSequence exp = new FibonacciSequence();
            exp.printFib(fibonacci);
        }


    }
    public static void printFib (int fibonacci){
        int dakka = 0;
        for(int i= 1;i < fibonacci; i++ ){
            dakka += i;
        }
        System.out.println(dakka);
    }
}
