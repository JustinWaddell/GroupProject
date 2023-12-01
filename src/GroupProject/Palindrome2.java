package GroupProject;
/**
 * class: Palindrome2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 2.	Create an instance method using a palindrome.
 */
import java.util.Scanner;

public class Palindrome2 {
    private static Scanner input;

    public static void main(String[] args) {
        Palindrome2 ans = new Palindrome2();
        input = new Scanner(System.in);
        String palin = ans.palidrome();
        System.out.println(palin);
    }

    public String palidrome() {

        String pal = input.nextLine();

        pal = pal.toLowerCase().replaceAll("(^a-zA-Z)", "");
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
        if (isPalindrome) {
            return (pal + " is a palindrome");
        } else {
            return (pal + " is not a palindrome");

        }
    }
}
