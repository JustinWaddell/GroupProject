package Homework.HomeWork4;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer to see if it is a prime number: ");
        int number = input.nextInt();
        boolean isprime = false;

        for(int i = 2; i <= number/2; i++) {
            if (number % i == 0){
                  isprime = false;
            }

                else {
                    isprime = true;

            }
        }
        if (isprime == false) {
            System.out.println("it is not a prime number");
        } else if (isprime == true) {
            System.out.println("it is a prime number");
        }



        }
}
