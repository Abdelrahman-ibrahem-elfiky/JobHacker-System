package AllProblems;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double a,b,c,average,sumWeight;
        int widthA=2,widthB=3,widthC=5;
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();

        sumWeight=(a*widthA)+(b*widthB)+(c*widthC);
        average=sumWeight/(double) (widthA+widthB+widthC);
        System.out.printf("MEDIA = %.1f\n",average);


    }
}
