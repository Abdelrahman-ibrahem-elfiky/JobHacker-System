package AllProblems;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int columnNumber,row=12,column=12;
        char operation;
        float average,sum=0;
        float array[][]=new float[row][column];

        columnNumber= input.nextInt();
        operation=input.next().charAt(0);
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < column; j++) {

                array[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i<column; i++) {
            sum += array[i][columnNumber];
        }

        if (operation=='S')
            System.out.printf("%.1f\n",sum);
        else {

            average = sum / column;
            System.out.printf("%.1f\n",average);
        }


    }
}
