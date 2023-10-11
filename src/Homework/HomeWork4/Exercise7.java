package Homework.HomeWork4;
/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.8 :This program is used to display 2 string values inputted by a user, by which is greater in
 * length, lexicograohic order, and as a sentence.
 */
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String str1 = input.nextLine();
        System.out.println("Please enter another string value.");
        String str2 = input.nextLine();

        int greaterlength = str1.length() - str2.length();
        int lexicograph = str1.compareTo(str2);

        if (greaterlength >= 1) {
            System.out.println("String" + str1 + "is greater than " + str2);
        }
        else if (str1.length() < str2.length()){
            System.out.println("String" + str2 + "is greater than" + str1);
        }
        else {
            System.out.println("The strings are the same length.");
        }
        if (lexicograph < 0) {
            System.out.println("String 1 appears before string 2 in lexicographic order.");
        }
        else if (lexicograph > 0){
            System.out.println("String 2 appears before string 1 in lexicograhic order.");
        }
        else{
            System.out.println("both strings are equal lexicographically");
        }
        System.out.println(str1 + " " + str2 + ".");



    }
}
