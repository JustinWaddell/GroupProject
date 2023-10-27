import java.sql.SQLOutput;
import java.util.Scanner;
public class Tutor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of people that are going.");
        int peeps = input.nextInt();
        Tutor1 tut = new Tutor1();
        double cash = tut.price(peeps);
        input.nextLine();
        System.out.println("Would you like snacks?");
        String ans = input.nextLine();

        if(ans.equalsIgnoreCase("y")){
            System.out.println("Ten dollars have been added to your amount");
            cash += 10;
            System.out.println(cash);

        }
        else{
            System.out.println(cash);
        }


    }
    //for loop
    public double price(int peeps) {
        Scanner input = new Scanner(System.in);
        int totprice = 0;
        for (int i = 0; peeps > i; peeps--) {
            System.out.println("Please enter the Person's age.");
            int age = input.nextInt();
            if (age <= 12) {
                totprice += 5;
            } else if (age >= 13 && age <= 19) {
                totprice += 8;
            } else if (age >= 20 && age <= 59) {
                totprice += 12;
            } else {
                totprice += 6;
            }
            peeps--;
        }
        return totprice;
    }
    //while loop
    /*public double price(int peeps){
        Scanner input = new Scanner(System.in);
        int totprice = 0;
        while(peeps > 0) {
            System.out.println("Please enter the Person's age.");
            int age = input.nextInt();
            if (age <= 12) {
                 totprice += 5;
            } else if (age >= 13 && age <= 19) {
                totprice += 8;
            } else if (age >= 20 && age <= 59) {
                totprice += 12;
            } else {
                totprice += 6;
            }
            peeps--;
        }
        return totprice;
    }*/

    /*public static double price(int age) {
        if (age <= 12) {
            return 5;
        } else if (age >= 13 && age <= 19) {
            return 8;
        } else if (age >= 20 && age <= 59) {
            return 12;
        } else {
            return 6;
        }
    }*/
}
