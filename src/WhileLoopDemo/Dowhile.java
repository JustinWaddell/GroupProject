package WhileLoopDemo;
import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        do{
            System.out.println(x);
        x++;
        }while(x <= 10);
    }
}
