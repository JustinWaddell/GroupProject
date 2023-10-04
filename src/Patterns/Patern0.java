package Patterns;

public class Patern0 {
    public static void main(String[] args) {
        for(int row = 0 ;row < 6  ; row++){
            for(int column = 1 ; column <= 6 - row ;column++){
                System.out.println(column + "");
            }
            System.out.println("");
        }
    }
}
