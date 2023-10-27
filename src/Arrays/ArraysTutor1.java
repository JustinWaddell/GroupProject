package Arrays;
import java.util.*;

public class ArraysTutor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long do you want your array to be.");
        int length = input.nextInt();
        input.nextLine();
        String[] favFood = new String[length];
        for(int i = 0; i < favFood.length; i++){
            System.out.println("Please enter your favourite food");
            favFood[i] = input.nextLine();
        }
        for(int i = 0; i < favFood.length; i++){
            System.out.println(favFood[i]);
        }
    }

}
