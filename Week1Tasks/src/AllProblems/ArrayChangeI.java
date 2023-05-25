package AllProblems;

import java.util.Scanner;

public class ArrayChangeI {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
          final int ARRAY_SIZE = 20;
          int number;
        int array[] = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {

            number = input.nextInt();
            array[i] = number;
        }
        int index = ARRAY_SIZE - 1;
        for (int i = 0; i < ARRAY_SIZE; i++) {

            System.out.println("N[" + i + "] = " + array[index]);
            index--;
        }
    }

}
