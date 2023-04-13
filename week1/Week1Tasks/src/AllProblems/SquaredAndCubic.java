package AllProblems;

import java.util.Scanner;

public class SquaredAndCubic {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int number,square,cubic;
        number= input.nextInt();

        for (int i = 1; i <= number; i++) {

            square=(int)Math.pow(i,2);
            cubic=(int)Math.pow(i,3);
            System.out.println(i+" "+square+" "+cubic);

        }
    }
}
