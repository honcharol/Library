package olg.stud;

public class Book extends LibraryReaders {

    String [][] arrStr = {{"book1",   "book2",   "book3",   "book4",   "book5"},
                          {"author1", "author2", "author3", "author4", "author5"}};
    public void takeBook(int str ){
        System.out.println( getName() + "  took  "+ str+ "  books");
    }
    public void takeBook(String str ){

    }
    public void returnBook(String str ){

    }
}
