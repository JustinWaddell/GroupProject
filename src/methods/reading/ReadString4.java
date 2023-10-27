package methods.reading;

import java.util.Scanner;

public class ReadString4 {

    private Scanner input;
    private String ReadString(Scanner input){
        System.out.println("Enter a string value");
        String str = input.nextLine();
        return str;

    }

    public static void main(String[] args) {
        ReadString4 Lilith = new ReadString4();
        Lilith.input = new Scanner(System.in);
        String str = Lilith.ReadString(Lilith.input);
        System.out.println(str);
    }
}
