package Homework.Chapter6;
/**
 * class: EvenNumber
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 12, 2023
 * Description: 5.12.8 :This program is used to roll 6 dice with different outputs using an indexed for loop;
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] dice2 = new int[6];
        for ( int i = 0; i <= dice2.length; i++){
            int [] diceValues = new int[]{(int) (Math.random() * (6)) + 1};
            System.out.println(diceValues[dice2[i]]);
        }
    }
}
