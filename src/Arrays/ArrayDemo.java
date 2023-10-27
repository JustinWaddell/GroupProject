package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] str = {"Apple", "Banana", "Strawberry"};
        System.out.println(str[2].length());
        //create an array named cities. Type is String
        //length of the array is 4
        String[] cities = new String[4];
        cities[0] = "New York";
        cities[1] = "Philadelphia";
        cities[2] = "Chicago";
        cities[3] = "Seattle";

        for (int i = 0; i < cities.length; i++) {
            if (i == cities.length - 1) {
                System.out.println(cities[i]);
            } else {
                System.out.println(cities[i] + ", ");
            }

        }
        double[] famousnumbers = {7, };
    }
}
