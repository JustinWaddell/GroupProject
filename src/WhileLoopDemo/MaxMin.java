package WhileLoopDemo;

public class MaxMin {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter integers as many as you want." +
                "To stop, you will need to enter any non-numerical character. ");
        int max = input.nextInt();
        int min = max;

        while(input.hasNextInt()){
            int value = input.nextInt();

            if(value > max){
                max = value;
            }
            if (value < min ) {
                min = value;

            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

    }
}
