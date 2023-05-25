package AllProblems;

import jdk.internal.org.objectweb.asm.tree.FieldInsnNode;

import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        final int ROW=12, COIUMN =12;
        int rowNumber;
        char operation;
        float average,sum=0;
        float arr[][]=new float[ROW][COIUMN];

        rowNumber= input.nextInt();
        operation=input.next().charAt(0);
        for (int i = 0; i <ROW; i++) {
            for (int j = 0; j < COIUMN; j++) {

                arr[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i< COIUMN; i++) {
            sum += arr[rowNumber][i];
        }

        if (operation=='S')
            System.out.println(sum);
        else {
            average = sum / COIUMN;
            System.out.println(average);
        }


    }
}
