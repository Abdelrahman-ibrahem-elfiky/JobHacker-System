package libraryManagementSystem;

import java.util.Scanner;
import java.util.Set;

public class applecation {
    static Library library=new Library();
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int status;
        do {
            display();
            System.out.println("Enter operation number ");
            status=in.nextInt();
            switch (status)
            {
                case 1:
                {
                    library.addNewBook();
                }break;
                case 2:
                {
                    library.removeBook();
                }break;
                case 3:
                {       library.checkOutBook();
                }break;
                case 4:
                {
                    library.returnBook();
                }break;
                case 5:
                {
                    library.displayAvailableBooks();
                }break;
                case 6:
                {
                    library.displayBorrowedBooks();
                }break;
                case 7:
                {
                    library.displayBookDetails();
                }break;
            }

        }while (status!=8);
    }
    public static void display()
    {
        System.out.println("1-Add Book");
        System.out.println("2-remove Book");
        System.out.println("3-checkout");
        System.out.println("4-return Book");
        System.out.println("5-show available books.");
        System.out.println("6-show borrowed books");
        System.out.println("7-show  book details");
        System.out.println("8-exit");
    }
}
