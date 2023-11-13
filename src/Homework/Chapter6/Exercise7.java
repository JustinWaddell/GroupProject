package Homework.Chapter6;
/**
 * class: Exercise7
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to determine the size of the list.
 */
import java.util.*;
import java.time.LocalDate;
import java.time.Month;
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));
        int size = centennials.size();
        System.out.println("size = " + size);
    }

}
