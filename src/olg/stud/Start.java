package olg.stud;

import java.util.Scanner;

public class Start extends Book {
    public static void main(String[] args) {
        Start lr = new Start();

        System.out.println("Enter name of reader : ");
        lr.setName(scan.nextLine());
        System.out.println("Enter faculty of reader : ");
        lr.setFaculty(scan.nextLine());
        System.out.println("Enter libraryCard of reader : ");
        lr.setLibraryCard(scan.nextInt());

        lr.getInfo();

        System.out.println("How many books will you take ???");
        lr.takeBook(scan.nextInt());




    }
}