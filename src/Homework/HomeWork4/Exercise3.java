/**
 * class: Exercise3
 * @author: Justin Maverick Waddell
 * @versionL 1.0
 * course: ITEC 2140 - 09, fall 2023
 * @written on: October 04, 2023
 * description: 4.11.3: This program is used to find the range in student's grades submitted
 * by the user.
 */
package Homework.HomeWork4;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.println("Enter the student's grades to find the range. ");
        System.out.print("To end the input of grades, enter a letter to finish.");
        double maximum = range.nextInt();
        double minimum = maximum;

        while(range.hasNextInt()){
            int value = range.nextInt();

            if(maximum > value){
                maximum = value;
            }
            if (minimum < value){
                minimum = value;
            }
        }
        System.out.println("The minimum is " + minimum + ", while the maximum is " + maximum);
    }
}
