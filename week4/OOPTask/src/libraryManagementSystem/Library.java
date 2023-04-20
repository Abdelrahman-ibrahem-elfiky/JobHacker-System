package libraryManagementSystem;

import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public   class Library {

    String libraryName;
    int libraryCode;
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public Library(String libraryName, int libraryCode) {
        this.libraryName = libraryName;
        this.libraryCode = libraryCode;
        this.bookList = bookList;
    }

    public Library() {

    }

    public void addNewBook() {
        Book book = new Book();
        book.insertBook();

            bookList.add(book);
            System.out.println("The Books Was Added Successfully The size of the list now is: " + bookList.size());


    }//this method used to add a new book in th library

    public void removeBook() {
        if (bookList.isEmpty()) {
            System.out.println("library is empty");
        } else {
            boolean flage;
            showBookId();
            System.out.println("Enter the book id you want to remove ");
            do {
                Scanner in = new Scanner(System.in);
                int bookId = in.nextInt();
                flage = false;
                for (int i = 0; i < bookList.size(); i++) {
                    if (bookList.get(i).getBookID() == bookId) {
                        String booktitle = bookList.get(i).getBookTitle();
                        bookList.remove(i);
                        System.out.println("removed the book:" + booktitle);
                        flage = true;
                        break;
                    }
                }
                if (flage==false)
                    System.out.println("pleas enter again:  ");

        } while (flage == false) ;
    }
        }
        //this method used to remove a new book to the library

    public void displayAvailableBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No book is available");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getBookAvailability() == true) {
                    System.out.println(" BookID: " + bookList.get(i).getBookID() + "  || BookTitle: " + bookList.get(i).getBookTitle()
                            + "   || BookVersion: " + bookList.get(i).getBookVersion() + "   ||AuthorName: " + bookList.get(i).getAuthorName()
                            + "   || BookAvailability: " + bookList.get(i).getBookAvailability());

                }

            }


        }
    }

    public void showBookId()//display all book id available and call in methode
    {

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookAvailability() == true) {
                System.out.println(" BookID: " + bookList.get(i).getBookID()
                                    +"  book title:  "+bookList.get(i).getBookTitle());
            }

        }
    }
    public void displayBookDetails() {
        showBookId();
        Scanner in = new Scanner(System.in);
        boolean flage;
        System.out.println("Enter the book id ");
        do {
            flage=false;
            int bookId = in.nextInt();
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getBookID() == bookId) {
                    System.out.println(" BookID: " + bookList.get(i).getBookID() + "\nBookTitle: " + bookList.get(i).getBookTitle()
                            + "\nBookVersion: " + bookList.get(i).getBookVersion() + "\nAuthorName: " + bookList.get(i).getAuthorName()
                            + "\nBookAvailability: " + bookList.get(i).getBookAvailability());
                        flage=true;
                        break;
                }
            }
            if (flage==false)
                System.out.println("The book ID you entered does not exist.pleas enter again");

        }while (flage=false);
    }


    public User signInUser()//register new user in the library
    {
        User user = new User();
        user.createUsre();
        users.add(user);
        return user;
    }

    public void borrowedBook(User user) {
        showBookId();

        boolean flage;
        System.out.println("Enter the book id ");
        do {
            flage=false;
            Scanner in = new Scanner(System.in);
            int bookId = in.nextInt();
            for (int i = 0; i < bookList.size(); i++) {

                if (bookList.get(i).getBookID() == bookId) {
                    user.BorrowedBooks.add(bookList.get(i));
                    System.out.println("checkout the book:" + bookList.get(i).getBookTitle());
                    bookList.remove(i);
                    flage = true;
                    break;
                }

            }
            if (flage == false) {
                System.out.println("The book ID you entered does not exist.pleas enter again");
            }
        }while (flage==false);
    }

    public void checkOutBook()//if the user  wants to borrow a book
    {
        if (bookList.isEmpty())
        {
            System.out.println("library is empty");
        }
else {
            if (users.isEmpty()) {
                User user = signInUser();
                //BORROWED
                borrowedBook(user);
            } else {

                Scanner in = new Scanner(System.in);
                System.out.println("Enter the User id ");
                boolean flage;
                do {
                     flage = false;//check if the user is found in the user's list or no
                    int UserId = in.nextInt();
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).userID == UserId) {
                            //BORROWED
                            borrowedBook(users.get(i));
                            flage = true;
                        }
                    }
                    if (flage == false) {
                        System.out.println("The User ID you entered does not exist.pleas enter again");
                    }
                }while (flage==false);
            }

        }
    }

    public void returnBook()//return the borrowed book to library
    {

        System.out.println("Enter the User id ");
        boolean flage;
        do {
            flage=false;
        Scanner in = new Scanner(System.in);
        int UserId = in.nextInt();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userID == UserId) {

                if (users.get(i).BorrowedBooks.isEmpty()) {
                    System.out.println("the user :" + users.get(i).getUserName() + "does not borrow any  books");
                }
                else {
                    RetrievingBook(users.get(i));
                    //book
                }
            flage=true;
                break;
            }
        }
        if (flage==false)
            System.out.println("The user ID you entered does not exist.pleas enter again ");

    }while (flage==false);
    }
    public void displayBorrowedBooks()//View all  borrowed books this user
    {
        System.out.println("Enter user id");
        Scanner in=new Scanner(System.in);
        boolean flage;
        do {
            flage=false;
        int userid= in.nextInt();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserID()==userid)
            {
                users.get(i).showBorrowedBooks();
                flage=true;
                break;
            }
        }
        if (flage==false)
            System.out.println("The book ID you entered does not exist.pleas enter again");

    }while (flage=false);

    }
public void RetrievingBook(User user)
{
    System.out.println("Enter the book id ");
    boolean flage;
    do {
        flage=false;
        Scanner in=new Scanner(System.in);
        int bookId = in.nextInt();
        for (int j = 0; j < user.BorrowedBooks.size(); j++) {

            if (user.BorrowedBooks.get(j).getBookID() == bookId) {


                bookList.add(user.BorrowedBooks.get(j));

                System.out.println("return book :" + user.BorrowedBooks.get(j).getBookTitle() + " the book list");
                user.BorrowedBooks.remove(j);
                flage = true;
                break;
            }
        }
        if (flage==false)
        {
            System.out.println("The book ID you entered does not exist.pleas enter again");
        }
    }while (flage==false);
}
}