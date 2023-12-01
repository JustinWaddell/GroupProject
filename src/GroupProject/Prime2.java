package GroupProject;

import Homework.Chapter5.IsPrime;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a integer.");
        int number = input.nextInt();
        Prime2 exp = new Prime2();
        exp.Prime(number);
    }
    public void Prime(int number){
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;
        if (number <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
        }
        if (isPrime){
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " is not prime");
        }
    }
}
