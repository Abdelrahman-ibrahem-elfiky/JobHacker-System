package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User {
    String userName;
    int userID;
    Library library=new Library();
    ArrayList<Book>BorrowedBooks=new ArrayList<>();

    public User(String userName, int userID,Library library) {
        this.userName = userName;
        this.userID = userID;
        this.library=library;
    }
    public User()
    {

    }
public void createUsre()//create new user
{   Scanner in =new Scanner(System.in);
    System.out.println("Enter User Name: ");
    this.userName=in.next();
    Random randomID=new Random();
    this.userID=randomID.nextInt(500);
    System.out.println("UserID: "+ this.userID);

}


    public void showBorrowedBooks()//View all  borrowed books this user
    {
        if (BorrowedBooks.isEmpty())
        {
            System.out.println("No books is Borrowed ");
        }
        else
        {
            for (int i = 0; i < BorrowedBooks.size(); i++)

                System.out.println("BookId: "+BorrowedBooks.get(i).getBookID()+"   Book Title: "+BorrowedBooks.get(i).getBookTitle());

        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return BorrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        BorrowedBooks = borrowedBooks;
    }
}
