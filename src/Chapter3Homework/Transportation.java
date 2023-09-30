package Chapter3Homework;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class Transportation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the transport mode: car, train, or plane");
        String ans = input.nextLine().toLowerCase();

        switch (ans){
            case "car":
            System.out.println("Enter a car model: sedan or sports ");
            String car = input.nextLine().toLowerCase();
            switch (car){
                case "sedan":
                    System.out.println("Max speed: 120 mph");
                    break;
                case "sports":
                    System.out.println("Max speed: 200 mph");
                    break;
            }
            case "train":
                System.out.println("enter a train model: bullet or frieght");
                String train = input.nextLine().toLowerCase();
                switch (train){
                    case "bullet":
                        System.out.println("Max speed: 250 mph");
                        break;
                    case "fright":
                        System.out.println("Max speed: 70 mph");
                        break;
                }
            case "plane":
                System.out.println("enter a plane model: jet or propeller");
                String plane = input.nextLine().toLowerCase();
                switch (plane){
                    case "jet":
                        System.out.println("Max speed: 600 mph");
                        break;
                    case "propeller":
                        System.out.println("Max speed: 200 mph");
                        ;
                }
        }

    }
}
