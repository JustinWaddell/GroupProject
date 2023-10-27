package methods.reading;
import java.util.Scanner;
public class ReadString2 {
    public static String readstring(Scanner input){
        /**
         * method: readString takes Scanner type object - reference variable name is input
         * @param: input
         * @return String value
         */
        System.out.println("Enter a string value:");
        String str = input.nextLine();
        return str;
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String str = readstring(x);
        System.out.println(str);;
    }

}
