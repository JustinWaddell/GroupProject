package methods.reading;
import java.util.Scanner;
public class ReadString1 {
    /**
     * method:readString()
     * @return String type value
     * description: this method is returning the same string value which the user inputs.
     */
    public static String readString(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string:"); //a prompt to ask a user to enter a String value
        String str = input.nextLine();
        return str;
    }
    public static void main(String[] args) {

        String result = readString();
        System.out.println(result);
    }
}
