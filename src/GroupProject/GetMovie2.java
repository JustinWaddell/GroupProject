package GroupProject;
/**
 * class: GetMovie2
 * @author: Justin Maverick Waddell
 * @version: 1.0
 * course: ITEC 2140 - 09, Fall 2023
 * written on: November 28, 2023
 * Question:8.	You need to create a program that gets the user to print out their favorite movie with
 * the year that it was made and who directed it.You are required to use
 * class methods to complete this program.
 */
import java.util.Scanner;

public class GetMovie2 {
    public static void main(String[] args) {
        GetMovie2 exp = new GetMovie2();
        String titleAns = exp.FindMovieName();
        int yearAns = exp.FindMovieYear();
        String directorAns = exp.FindMovieDirector();
        System.out.println(titleAns + ", " + yearAns + ", " + directorAns);
    }
    public String FindMovieName(){
        System.out.println("Please enter the title of the movie");
        Scanner find = new Scanner(System.in);
        String title = find.nextLine();
        return title;
    }
    public Integer FindMovieYear(){
        System.out.println("Now enter the year of the release date");
        Scanner the = new Scanner(System.in);
        int year = the.nextInt();
        return year;
    }
    public String FindMovieDirector(){
        System.out.println("Finally enter the director of the movie");
        Scanner input = new Scanner(System.in);
        String director = input.nextLine();
        return director;
    }
}
