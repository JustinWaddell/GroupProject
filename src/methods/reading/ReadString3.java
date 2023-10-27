package methods.reading;

import java.util.Scanner;

public class ReadString3 {
    private Scanner input; // attribute, data - instance data or instance attribute
    /**
     * method:readString()
     * @return String value
     * instance method --> if you need to invoke/call this method in the main method or any other
     * methods, what do you need? Please remember to creat an object - ReadString3 type object.
     * ReadString3 rs = new ReadString3();
     * rs.readString()
     */
    public String readString(){
        System.out.println("Enter a string value:");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        ReadString3 Sam = new ReadString3();
        Sam.input = new Scanner(System.in);
        String str = Sam.readString();
        System.out.println(str);
    }
}
