package AllProblems;

import java.util.Scanner;

public class ArrayChangeI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 20, number;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {

            number = input.nextInt();
            array[i] = number;
        }
        int Index = size - 1;
        for (int i = 0; i < size; i++) {

            System.out.println("N[" + i + "] = " + array[Index]);
            Index--;
        }
    }

}
