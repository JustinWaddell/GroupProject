package Homework.Chapter5;
/**
 * class: Exercise1
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.1 :This program is used to print what the user print inside.
 */
import java.util.Scanner;
public class GetUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a sentence or string");
        String content = input.nextLine();
        GetUserInput exp = new GetUserInput();
        exp.getInput(content);
    }
    public void getInput(String content){

        System.out.println(content);
    }
}
