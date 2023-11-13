import java.util.*;
public class testin {
    public static void main(String[] args) {

    int times = 5, sides = 6, dice = 2;           // initialize variables
    ArrayList<Integer> rolls = new ArrayList<>();
    int[] occurrences = new int[dice * sides];      // still makes sense to use array here!

    for (int i = 0; i < times; i++) {               // perform the rolls and update tallies
        int total = 0;
        for (int j = 0; j < dice; j++)
            total += roll(1, sides);
        rolls.add(total);
        occurrences[total-1]++;
    }

    for (int i = 0; i < occurrences.length; i++)    // print histogram of results
        System.out.printf("%2s  %-20s%n", i+1, barify(occurrences[i]));
}

    public static int roll(int min, int max) {
        int range = max - min;
        return (int)(Math.random() * range) + min;
    }

    public static String barify(int value) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < value; i++)
            bar.append('*');
        return bar.toString();
    }


}

