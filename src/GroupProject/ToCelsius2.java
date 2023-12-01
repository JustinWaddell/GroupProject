package GroupProject;
/**
 * class: ToCelsius2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 5.	You’re making a website that gets the user to input the temperature in Fahrenheit to make it turn it to degree’s Celsius. Create the code below using this to help finish it.
 * •	Give equation (Fahrenheit -32) * 5/9
 */

import java.util.Scanner;

public class ToCelsius2 {
    public int CelsiusAndBeyond(){
        System.out.println("Enter the degrees in farenheit to the rounded to the nearest whole number.");
        Scanner input = new Scanner(System.in);
        int farenheit = input.nextInt();
        int celsius = (farenheit - 32) * 5/9;
        return celsius;
    }

    public static void main(String[] args) {
        ToCelsius2 exp = new ToCelsius2();
        Scanner input = new Scanner(System.in);
        int ans = exp.CelsiusAndBeyond();
        System.out.println(ans + "degrees Celsius");
    }
}
