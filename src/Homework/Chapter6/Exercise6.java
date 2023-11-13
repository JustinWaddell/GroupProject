package Homework.Chapter6;
/**
 * class: EvenNumber
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to remove the odd errant in the list;
 */
import java.util.ArrayList;
import java.time.Month;
import java.time.LocalDate;
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        centennials.remove(LocalDate.of(1900, Month.JULY, 4));
        int listSize = centennials.size();
        System.out.println(centennials);
    }
}
