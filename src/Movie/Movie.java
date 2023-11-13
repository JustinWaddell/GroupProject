package Movie;

import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class Movie {
    private String title;
    private int year;
    private String director;
    private String leadingRole;

    public Movie(){
        //(1)
//        this.title = "n/a";
//        this.year = 0;
//        this.director = "n/a";
//        this.leadingRole = "n/a";
        //(2)
        //this("n/a", 0, "n/a", "n/a");
        //(3)
        setTitle("will be assigned");
        setDirector("will be assigned");
        setYear(0);
        setLeadingRole("will be anounced");
    }
    public Movie(String title, int year, String director, String leadingRole){
        this.title = title;
        this.year = year;
        this.director = director;
        this.leadingRole = leadingRole;
    }

    public String getTitle(){
        return title;
    }

    public int getYear() {
        return year;
    }
    public String getDirector(){
        return director;
    }

    public String getLeadingRole() {
        return leadingRole;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLeadingRole(String leadingRole) {
        this.leadingRole = leadingRole;
    }
    @Override
   public String toString(){
       return title + " " + year + " " + director + " " + leadingRole;
   }


        }
