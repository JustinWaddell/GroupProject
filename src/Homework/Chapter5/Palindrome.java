package Homework.Chapter5;
/**
 * class: Palindrome
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 4.12.12 :This program is used to see if a String entered by the user is a palindrome.
 */
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please put in a string");
        String pal = input.nextLine();
        boolean isPalindrome = true;
        Palindrome exp = new Palindrome();
        exp.IsPalindrome(pal);
        /*if (pal) {
            System.out.println(pal + " is a palindrome");
        }
        else{
            System.out.println(pal + " is not a palindrome");
        }*/


    }

    public void IsPalindrome(String pal) {
        int low = 0; //index of a string value
        int high = pal.length() - 1; // last index of a string value
        //create a sentinel variable
        boolean isPalindrome = true;
        while (low < high) {
            if (pal.charAt(low) != pal.charAt(high)) {
                //this not a palindrome
                isPalindrome = false;
                break;
            }
            low++;
            high--;

        }
        if (isPalindrome){
            System.out.println(pal + " is a palindrome.");
        }
        else {
            System.out.println(pal + " is not a palindrome.");
        }
    }
}
