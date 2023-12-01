package GroupProject;

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
