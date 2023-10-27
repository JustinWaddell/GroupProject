package ForLoopDemo;

public class Day {
    public static void main(String[] args) {

        String day = "Sunday";
        String newDay = "";

        for(int i = 0; i < day.length(); i++){
            System.out.println(day.charAt(i));

            newDay += day.charAt(i);
        }
        System.out.println(newDay);
        System.out.println("" + 'a' + 'b' + 'c');
        System.out.println('a' + 'b' + 'c');
    }
}
