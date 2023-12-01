package GroupProject;

/**
 * class: Palindrome2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 7.	There is an error in your businesses code causing all the words to become backwards.
 * However, you cannot delete the code itself. Create an instance method that will
 * reverse all the words submitted by the user.
 */

import java.util.Scanner;

public class ReverseTheReverse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed.");
        String reverse = input.nextLine();
        ReverseTheReverse2 exp = new ReverseTheReverse2();
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
