package WhileLoopDemo;

import java.util.Random;

public class SimplePassword {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter the length of the password you want to generate: ");

        int lengthOfPassword = input.nextInt();
        Random rn = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#%^&*(0)_+-=";

        String password = "";
        int something = 0;
        //initialization
        while(something < lengthOfPassword){
            int index = rn.nextInt(characters.length());
            //statement
            password += characters.charAt(index);
            //update
            something++;

        }
        System.out.println("Your password is " + password);
    }
}
