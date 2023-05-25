package AllProblems;

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        final int ROW=12,COLUMN=12;
        int number=0;
        char operation;
        float average,sum=0;
        float array[][]=new float[ROW][COLUMN];

        operation=input.next().charAt(0);
        for (int i = 0; i <ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {

                array[i][j]=input.nextFloat();
            }
        }
        for (int i = 1; i<ROW; i++) {
            number+=i;
            for (int j = 0; j < i; j++) {
                sum += array[i][j];
            }
        }

        if (operation=='S')
        {
            System.out.printf("%.1f\n",sum);
        }
        else {

            average = (sum/number);
            System.out.printf("%.1f\n",average);
        }


    }
}
