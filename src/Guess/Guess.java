package Guess;

import java.util.Scanner;

public class Guess {
    private int guess;
    private int limits;
    private boolean win;
    private Scanner scanner;
    public Guess(){



        guess = (int)(Math.random() * 101);
        limits = 10;
        win = false;
        scanner = new Scanner(System.in);

    }
    public void play(){

        while (limits > 0 && !win){

            System.out.println("guess a number between 0 & 100 ,and" + limits + "times left" );
            int urguess = scanner.nextInt();
            if(urguess == guess){
                System.out.println("true");
                win = true;
            }
            else if(urguess < guess){
                System.out.println(urguess + "is low. try again");
                limits--;
            }
            else{
                System.out.println(urguess + "is too high. try again");
                limits--;
            }
        }
        if(!win ){
            System.out.println("You lose. Guess is " + guess);
        }
    }
}
