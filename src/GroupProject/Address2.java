package GroupProject;
import Homework.Chapter5.GetAddress;

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
