package Movie;

import java.util.Scanner;

public class Movietester {

    static class MovieTester {
        public static void main(String[] args) {
            Movie m1 = new Movie();
            System.out.println(m1);
            Movie m2 = new Movie("Gone with the wind", 1956, "Shamu", "Bingus");

            System.out.println(m2);

            Movie m3 = new Movie();
            java.util.Scanner input = new Scanner(System.in);

            System.out.println("Enter the title of the movie:");
            String title = input.nextLine();
            m3.setTitle(title);
            System.out.println("Enter the year of the movie");
            int year = input.nextInt(); //token based
            m3.setYear(year);
            System.out.println("Enter the directors name");
            input.nextLine();//This is used to make it run properly
            String director = input.nextLine(); // non-token based
            m3.setDirector(director);
            System.out.println("Enter the leading actor");
            String leadingRole = input.nextLine();
            m3.setLeadingRole(leadingRole);

            System.out.println(m3);

            System.out.println(m3.getTitle());
        }

}
}
