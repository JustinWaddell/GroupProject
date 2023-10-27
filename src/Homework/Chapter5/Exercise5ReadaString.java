package Homework.Chapter5;
/**
 * class: Exercise5ReadaString
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.5 :This program is used to read string inputted by the user using a instance method
 * with a scanner parameter.
 */
import java.util.Scanner;
public class Exercise5ReadaString {
    private Scanner input;
    private String Sam(Scanner input){
        System.out.println("Please type a string");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        Exercise5ReadaString Ans = new Exercise5ReadaString();
        Ans.input = new Scanner(System.in);
        String newStr = Ans.Sam(Ans.input);
        System.out.println(newStr);

    }
}
