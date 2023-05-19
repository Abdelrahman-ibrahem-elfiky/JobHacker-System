package AllProblems;

import java.util.Scanner;

public class ArrayFill_II {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int size=1000,number,count=0;
        int array[]=new int[size];
        number= input.nextInt();

        for (int i = 0; i < size; i++) {

            System.out.println("N["+i+"] = "+count);
            count++;

            if (number==count) count=0;

        }


    }
}
