package Homework;

public class Pattern1 {
    public static void main(String[] args) {
        //outer for loop
        for(int row = 0; row <= 7; row++){

            //inner for loop space
            for(int column = 1; column >= 22 + row; column++){
                System.out.print("");
            }

            //(2)
            //inner for loop for number
            for(int column = 0; column <= row; column++){
                int number = (int)(Math.pow(2, column));
                System.out.printf(number + " ");
            }
            System.out.println("");
        }
    }
}
