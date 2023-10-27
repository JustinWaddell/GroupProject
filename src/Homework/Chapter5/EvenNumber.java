package Homework.Chapter5;
/**
 * class: EvenNumber
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.8 :This program is used to see if a number is even using an instance method
 */
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is even.");
        int num = input.nextInt();
        EvenNumber exp = new EvenNumber();
        exp.IsEven(num);
    }
    public void IsEven(int num) {
        
        if (num % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");;
        }

    }
}
