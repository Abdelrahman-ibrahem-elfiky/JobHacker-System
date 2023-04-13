package AllProblems;

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int row=12,column=12,number=0;
        char operation;
        float average,sum=0;
        float array[][]=new float[row][column];

        operation=input.next().charAt(0);
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < column; j++) {

                array[i][j]=input.nextFloat();
            }
        }
        for (int i = 1; i<row; i++) {
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
