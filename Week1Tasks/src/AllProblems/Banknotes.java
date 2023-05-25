package AllProblems;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);


        int value,banknotes=100;
        value=input.nextInt();
        System.out.println(value);

        while (value>=0)
        {
            int count=value/banknotes;
            value-=(count*banknotes);
            System.out.println(count+" nota(s) de R$ "+banknotes+",00");
            banknotes/=2;
            if (banknotes==25)
                banknotes-=5;
            if (banknotes==0)
                break;
        }
    }
}
