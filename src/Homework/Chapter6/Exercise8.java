package Homework.Chapter6;
/**
 * class: Exercise8
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to see if centennial (1876, at 100 years) is present.
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        LocalDate date = LocalDate.of(1876, Month.JULY, 4);
        boolean presence = centennials.contains(date);
        if (presence){
            System.out.println("The year 1876 is contained in the list");
        }
        else {
            System.out.println("The year 1876 is not contained in the list");
        }
    }
}
