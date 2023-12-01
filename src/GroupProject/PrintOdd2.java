package GroupProject;

import java.util.Scanner;

public class PrintOdd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is odd.");
        int num = input.nextInt();
        PrintOdd2 exp = new PrintOdd2();
        exp.IsOdd(num);
    }
    public void IsOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("The number is odd");;
        }

    }
}
