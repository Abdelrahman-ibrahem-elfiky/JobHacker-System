package AllProblems;

import java.util.Scanner;

public class ArrayChangeI {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
          final int SIZE = 20;
          int number;
        int array[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {

            number = input.nextInt();
            array[i] = number;
        }
        int index = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {

            System.out.println("N[" + i + "] = " + array[index]);
            index--;
        }
    }

}
