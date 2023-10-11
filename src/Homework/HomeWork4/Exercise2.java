/**
 * class: Exercise2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 10, Fall 2023
 * @writtenon: October 4, 2023
 * description: 4.11.2: This program is used to find the mean of students submitted by the user.
 */
package Homework.HomeWork4;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the students grades to find the mean, " +
                "to stop input of grades enter a letter into the system");
        double sum = 0;
        double length = 0;
        for (int num = 0; num < 5; num++){

        }

        while (input.hasNextInt()) {
            int grades = input.nextInt();
            sum = sum + grades;
            length++;
        }
        System.out.println("The Mean of all of the grades is " + sum / length);
    }

}
