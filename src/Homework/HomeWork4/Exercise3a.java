package Homework.HomeWork4;
import java.util.Scanner;
public class Exercise3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number n: ");

        int n = input.nextInt();
        int sumOfEven = 0;
        int x = 1;
        if (n > 0 && n <= 1000) {
            for (int i = 1; i <= n; i++) {


                    int product = n % 10;
                    if (i % 2 == 0) {
                        sumOfEven = sumOfEven + i;
                    } else {
                        x = x * product;
                    }

            }
            System.out.println("The sum of the even number is: " + sumOfEven);
            System.out.println("The product of the odd numbers is: " + x);

        } else {
            System.out.println("invalid input; Please try again.");
        }
    }
}



