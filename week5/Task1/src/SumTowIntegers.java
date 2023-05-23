import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTowIntegers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1=0 , number2=0;
        boolean flag=true;
        do {
            try {
                System.out.print("Enter the first Number: ");
                number1 = input.nextInt();
                flag=true;
            } catch (InputMismatchException e) {
                flag=false;
                System.out.println("Invalid input! Please enter an integer number.");
                input.nextLine(); // Clear the input buffer
            }
        }while (flag==false);

        do {
            try {
                System.out.print("Enter the second Number: ");
                number2 = input.nextInt();
                flag=true;//if input is valid break
            } catch (InputMismatchException e) {
                flag=false; //if input is not valid again enter number
                System.out.println("Invalid input! Please enter an integer number.");
                input.nextLine(); // Clear the input buffer
            }
        }while (flag==false);



        int sum = number1 + number2;
        System.out.println("Sum: " + sum);

        input.close();
    }
}
