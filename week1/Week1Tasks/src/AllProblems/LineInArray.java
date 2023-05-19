package AllProblems;

import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int rowNumber,row=12, column =12;
        char operation;
        float average,sum=0;
        float arr[][]=new float[row][column];

        rowNumber= input.nextInt();
        operation=input.next().charAt(0);
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < column; j++) {

                arr[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i< column; i++) {
            sum += arr[rowNumber][i];
        }

        if (operation=='S')
            System.out.println(sum);
        else {
            average = sum / column;
            System.out.println(average);
        }


    }
}
