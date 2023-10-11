package Homework.HomeWork4;
/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.9 :This program is used to present a string value inputted by a user along with a
 * character value and its last place in the string value, if it is not in the string value its index
 * will be shown as -1
 */
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a string character.");
        String str = input.nextLine();
        System.out.println("Please enter a character value.");
        char chr = input.nextLine().charAt(0);

        int index = str.lastIndexOf(chr);

        if(index == -1){
            System.out.println("-1");
        }
        else {
            System.out.println(index);
        }




        System.out.println("Last occurence of charcter '" + chr + "' in " + str + "is at index" );

    }
}
