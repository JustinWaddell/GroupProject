package Homework.Chapter6;
/**
 * class: EvenNumber
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to roll 10 dice using an enhanced for loop, the
 */
import java.sql.Array;
import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        int[] dice3 = new int[10];
        Random rand = new Random();
        for(int i : dice3){
            int n = rand.nextInt(7);
            System.out.println(n);
        }
    }
}
