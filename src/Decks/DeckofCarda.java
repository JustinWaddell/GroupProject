package Decks;
import java.util.Random;
public class DeckofCarda {
    public static void main(String[] args) {
        int[] numberOfCards = new int[52];
        String[] suits = {"Diamonds","Spades","Hearts","Clubs"};
        String[] faceOfCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King"};

        for (int i = 0; i < numberOfCards.length; i++){
            numberOfCards[i] = i;
        }

        //shuffling the cards from here
        Random ran = new Random();
        //ran.nextInt(52);
        //(int)(Math.random()*numberOfCards.length)
        for(int i = 0; i < numberOfCards.length;i++){
            int randomIndex = ran.nextInt(52);
            //switch or swap
            int temp = numberOfCards[i];
            numberOfCards[i] = numberOfCards[randomIndex];
            numberOfCards[randomIndex] = temp;
        }
        for (int i = 0; i < 4; i ++){
            String suit = suits[numberOfCards[i]/13] ;
            String face = faceOfCards[numberOfCards[i] % 13];
            System.out.println(face + " " + "of" + " " + suit);
        }
    }
}
