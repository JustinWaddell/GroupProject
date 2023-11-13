package Homework.Chapter6;
/**
 * class: Exercise5
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to create an array list that takes integers that occur in both
 * array lists and put them in a new one.
 */
import java.util.*;
public class Exercise5 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};
        ArrayList<Integer> intersection = new ArrayList<>();
        intersection.add(2);
        intersection.add(4);
        intersection.add(8);
        intersection.add(10);
        System.out.println(intersection);
        }
}
