package GroupProject;
/**
 * class: LegoCityCrisis2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question:	9.	A man has fallen in the river in Lego city, create a program uses an instance method
 * or methods that adds up the users input of how many red blocks,
 * yellow blocks,and blue blocks they have, along with how many of each they have.
 */
        import java.util.Scanner;
public class LegoCityCrisis2 {
    public static void main(String[] args) {
        LegoCityCrisis2 exp = new LegoCityCrisis2();
        int buildingBlocks = exp.BlocksForDays();
        System.out.println(buildingBlocks);
    }
    public int BlocksForDays(){
        System.out.println("How many red blocks do you need?");
        Scanner input = new Scanner(System.in);
        int redBlocks = input.nextInt();
        System.out.println("How many yellow blocks do you need?");
        int yellowBlocks = input.nextInt();
        System.out.println("How many blue blocks do you need?");
        int blueBlocks = input.nextInt();
        return redBlocks + yellowBlocks + blueBlocks;
    }
    // or they could do this
    /*
    private Scanner yes;
    public static void main(String[] args) {
        LegoCityCrisis newexp = new LegoCityCrisis();
        int b1 = newexp.redBlocks();
        int b2 = newexp.blueBlocks();
        int b3 = newexp.yellowBlocks();
        System.out.println(b1 + b2 + b3);
    }
    public int redBlocks(){
        System.out.println();
        int rb = yes.nextInt();
        return rb;
    }
    public int blueBlocks(){
        System.out.println();
        int bb = yes.nextInt();
        return bb;
    }
    public int yellowBlocks(){
        System.out.println();
        int yb = yes.nextInt();
        return yb;
    }

     */
}
