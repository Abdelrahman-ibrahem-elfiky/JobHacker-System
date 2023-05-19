package AllProblems;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);


        int value,even=0,odd=0,positive=0,negative=0;
        for (int i=0;i<5;i++)
        {
            value= input.nextInt();
            if(value%2==0)even++;
            if (Math.abs(value)%2==1)odd++;
            if (value>0)positive++;
            if (value<0)negative++;

        }
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");

    }
}
