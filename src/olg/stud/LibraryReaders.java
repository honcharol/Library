package olg.stud;

import java.util.Scanner;

public class LibraryReaders{
    private String name;
    private int libraryCard;
    private String faculty;
    static Scanner scan = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }


    public void getInfo( ){
        System.out.println("name          " + name);
        System.out.println("faculty       " + faculty);
        System.out.println("library card  " + libraryCard);
    }

}
