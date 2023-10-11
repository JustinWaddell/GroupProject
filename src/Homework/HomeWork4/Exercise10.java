package Homework.HomeWork4;
/**
 * class: Exercise10
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 10, 2023
 * Description: 4.11.10 :This program is used to display ad upside down right triangle.
 */
public class Exercise10 {
    public static void main(String[] args) {
        for(int row = 1; row <= 6; row++){

            //inner for loop space
            for(int column = 0; column <= 7 + row; column++){
                System.out.print("");
            }

            //(2)
            //inner for loop for number
            for(int column = 6; column >= row; column--){
                String star = "*";
                System.out.printf(star);
            }
            System.out.println("");
        }
    }
}
