package AllProblems;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        final int ROW=12,COLUMN=12;
        int columnNumber;
        char operation;
        float average,sum=0;
        float array[][]=new float[ROW][COLUMN];

        columnNumber= input.nextInt();
        operation=input.next().charAt(0);
        for (int i = 0; i <ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {

                array[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i<COLUMN; i++) {
            sum += array[i][columnNumber];
        }

        if (operation=='S')
            System.out.printf("%.1f\n",sum);
        else {

            average = sum / COLUMN;
            System.out.printf("%.1f\n",average);
        }


    }
}
