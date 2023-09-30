package Chapter3Homework;
import java.util.Scanner;
public class Banking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter withdraw, deposit, or check balance");
        String ans = input.nextLine().toLowerCase();
        double balance = 5000.0;

        switch (ans){
            case "withdraw":
                Scanner withdraw = new Scanner(System.in);
                System.out.println("Enter a withdraw amount:");
                double amount = input.nextDouble();
                System.out.println("Withdrew: $ " + amount);
                System.out.println("current balance: $ " + (balance - amount));
                break;
            case "deposit":
                Scanner deposit = new Scanner(System.in);
                System.out.println("Enter a deposit amount: ");
                double money = input.nextDouble();
                if (money >= 10000){
                    System.out.println("You cannot deposit this amount ");
                }
                else{
                    System.out.println("Deposit : $ " + money);
                    System.out.println("Current balance: $ " + (balance + money));
                }
                break;
            case "check balance":
                System.out.println("Balance: $ " + balance);
                break;
        }
    }

}
