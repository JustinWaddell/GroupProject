package Chapter3Homework;
import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
public class Ecommerce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: buy, sell, or inventory: ");
        String ans = input.nextLine().toLowerCase();
        int inventory = 50;
        switch (ans) {
            case "buy":
                System.out.println("Enter the amount to buy: ");
                int buy = input.nextInt();
                System.out.println("Bought " + buy + "items");
                System.out.println("Current inventory: " + (inventory - buy));
                break;
            case "sell":
                System.out.println("Enter an amount to sell: ");
                int sell = input.nextInt();
                System.out.println("Sold" + sell + "items");
                System.out.println("Current inventory: " + (inventory - sell));
                break;
            case "inventory":
                System.out.println("Current inventory: " + inventory);
                break;
        }
    }
}
