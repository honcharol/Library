package olg.stud;

public class Book extends LibraryReaders {
    Book b = new Book();

    String [][] arrStr = {{"book1",   "book2",   "book3",   "book4",   "book5"},
                          {"author1", "author2", "author3", "author4", "author5"}};

    public void takeBook(int str ){
        String s = b.getName();
        System.out.println( s + "  took  "+ str+ "  books");
    }
    public void takeBook(String str ){

    }
    public void returnBook(String str ){

    }
}
