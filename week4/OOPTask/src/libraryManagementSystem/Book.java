package libraryManagementSystem;

import java.util.Random;
import java.util.Scanner;

public class Book {
    /* data */
    private String bookTitle,authorName,bookVersion;
    boolean bookAvailability;
   private int bookID;
   /*constructor*/
   public Book()
    {

    }
    public Book(String bookTitle, String authorName, String bookVersion) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.bookVersion = bookVersion;
    }

    /*methods getter and setter*/
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean getBookAvailability() {
        return bookAvailability;
    }

    public void setBookAvailability(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookVersion() {
        return bookVersion;
    }

    public void setBookVersion(String bookVersion) {
        this.bookVersion = bookVersion;
    }

    /*this method  create new book in the library*/
    public void insertBook()//this method  create new book in the library

    {

            Scanner in = new Scanner(System.in);
            System.out.print("enter bookTitle:  ");
            bookTitle = in.next();
            System.out.print("\nenter authorName:  ");
            authorName = in.next();
            System.out.print("\nenter bookVersion:  ");
            bookVersion = in.next();
            bookAvailability = true;
            Random r=new Random();//create random id for book
            bookID=r.nextInt(500);
            System.out.println("created bookID is: "+bookID);


    }

}
