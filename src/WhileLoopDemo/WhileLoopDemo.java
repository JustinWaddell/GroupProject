package WhileLoopDemo;
import java.util.Scanner;
public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int number = input.nextInt();
        int i = 1;

        if(number >= 1 && number <= 100) {

            while(i <= number) {
                if (i % 2 != 1) {
                    System.out.println(i);

                }

            }
        }
        else{
            System.out.println("invalid");
        }
    }
}
