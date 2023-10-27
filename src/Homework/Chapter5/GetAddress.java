package Homework.Chapter5;
/**
 * class: GetAddress
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: October 26, 2023
 * Description: 4.11.13 :This program is uses 2 class methods for the print to print out there address.
 */
import java.util.Scanner;
public class GetAddress {
    public static void main(String[] args) {
        String nA = nameAddress();
        String cS = cityState();
        System.out.println(nA + cS);
    }
    public static String nameAddress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the name of the address.");
        String name = input.nextLine();
        System.out.println("Please input the address itself");
        String address = input.nextLine();
        return name + ", " + address;

    }
    public static String cityState() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the city of the address.");
        String city = input.nextLine();
        System.out.println("Please input the state for the address.");
        String state = input.nextLine();

        return ", " + city + " " + state;
    }
}
