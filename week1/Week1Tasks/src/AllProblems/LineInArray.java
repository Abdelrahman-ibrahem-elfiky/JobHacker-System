package AllProblems;

import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        final int ROW=12, COLUMN =12;
        int rowNumber;
        char operation;
        float average,sum=0;
        float arr[][]=new float[ROW][COLUMN];

        rowNumber= input.nextInt();
        operation=input.next().charAt(0);
        for (int i = 0; i <ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {

                arr[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i< COLUMN; i++) {
            sum += arr[rowNumber][i];
        }

        if (operation=='S')
            System.out.println(sum);
        else {
            average = sum / COLUMN;
            System.out.println(average);
        }


    }
}
