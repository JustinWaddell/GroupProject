package Homework.Chapter5;
/**
 * class: ReverseString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 5.12.11 :This program is used to reverse a string with a method.
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed.");
        String reverse = input.nextLine();
        ReverseString exp = new ReverseString();
        exp.Reverse(reverse);
    }
    public void Reverse(String reverse){
        String reversion = "";

        for (int i = reverse.length()-1; i >= 0; i--){
            reversion += reverse.charAt(i);
        }
        System.out.println(reversion);
    }
}
