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
