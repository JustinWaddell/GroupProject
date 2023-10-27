import java.util.Scanner;
public class testin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short weight = 6;
        short height;
        do
        {
            System.out.print(weight + "-");
            weight --;
        }
        while (weight > 4);

        for (height = weight; height < 7; height++)
        {
            System.out.print(height + "#");
        }
        System.out.println(weight);
        System.out.println(height);
    }
}

