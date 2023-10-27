package Homework.Chapter5;
/**
 * class: GameScores
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 5.12.14 :This program is used to see if a number is a prime number.
 */
import java.util.*;
public class GameScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameScores exp = new GameScores();
        exp.printScore();

        System.out.println("Type in stop to not repeat the prgram");
        String stop = input.nextLine().toLowerCase();
        if (stop.equalsIgnoreCase("stop")){
            System.out.println("Thank you for your time.");
        }
        else {
            String games = printScore();;
        }
    }
    public static String printScore () {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a name.");
        String name = input.nextLine();
        int highScore = 0;
        String both = name + " " + highScore;
        if (name == "stop") {
            return "Thank you for time";

        }
        else {
            System.out.println("Type in the highscore for the name mentioned before.");
            highScore = input.nextInt();
            System.out.println(name + " " + highScore);
        }
        return name + highScore;

    }
}
