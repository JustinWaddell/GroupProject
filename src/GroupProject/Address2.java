package GroupProject;
/**
 * class: Address2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question:	You’re creating a website that needs to record their address for its users
 * to help in the purchasing process. Create an instance method that will print
 * out the user’s address after putting all the requested information
 */


import java.util.Scanner;
public class Address2 {
    public static void main(String[] args) {
        Address2 ans = new Address2();

        String nA = ans.GetAddress();
        String cS = ans.getcityState();
        System.out.println(nA + cS);
    }



    public String GetAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the name of the address.");
        String name = input.nextLine();
        System.out.println("Please input the address itself");
        String address = input.nextLine();
        return name + ", " + address;

    }
    public String getcityState() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the city of the address.");
        String city = input.nextLine();
        System.out.println("Please input the state for the address.");
        String state = input.nextLine();

        return ", " + city + " " + state;
    }

}
