package GroupProject;
/**
 * class: PrintUserName2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question: 1.	Your boss asks you to create a program that prints out the user’s names.
 * Create an instance method that allows the user to print out their name.
 */
import java.util.Scanner;
public class PrintUserName2 {

    public String UserName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please print your full name.");
        String name = input.nextLine();
        return name;
    }

    public static void main(String[] args) {
        PrintUserName2 exp = new PrintUserName2();
        String userName = exp.UserName();
        System.out.println(userName);
    }
}
