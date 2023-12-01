package GroupProject;
import java.util.Scanner;
public class PrintUserName2 {

    public String UserName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please print your full name.");
        String name = input.nextLine();
        return name;
    }

    public static void main(String[] args) {
        PrintUserName2 exp = new PrintUserName2();
        String userName = exp.UserName();
        System.out.println(userName);
    }
}
