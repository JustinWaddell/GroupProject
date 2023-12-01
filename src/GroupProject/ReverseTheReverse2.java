package GroupProject;

import Homework.Chapter5.ReverseString;

import java.util.Scanner;

public class ReverseTheReverse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed.");
        String reverse = input.nextLine();
        ReverseTheReverse2 exp = new ReverseTheReverse2();
        exp.Reverse(reverse);
    }
    public void Reverse(String reverse){
        String reversion = "";

        for (int i = reverse.length()-1; i >= 0; i--){
            reversion += reverse.charAt(i);
        }
        System.out.println(reversion);
    }
}
