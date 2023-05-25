package AllProblems;

import java.util.Scanner;

public class ArrayFill_II {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        final int ARRAY_SIZE=1000;
         int number,count=0;
        int array[]=new int[ARRAY_SIZE];
        number= input.nextInt();

        for (int i = 0; i < ARRAY_SIZE; i++) {

            System.out.println("N["+i+"] = "+count);
            count++;

            if (number==count) count=0;

        }


    }
}
