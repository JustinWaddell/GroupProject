package Homework.Chapter6;
/**
 * class: Exercise4
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to print out 10 different dice roles
 * in an array list using an enhanced for loop
 */
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        int[] dice4 = new int[5];
        Random rand = new Random();
        for(int i : dice4){
            int n = rand.nextInt(7);
            System.out.println(n);
        }
    }
}
