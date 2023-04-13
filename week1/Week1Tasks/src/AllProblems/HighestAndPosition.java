package AllProblems;

import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int number,highestNumber=0,position=0;
        for (int i = 1; i <=100; i++) {

            number= input.nextInt();
            if(number>highestNumber)
            {
                highestNumber=number;
                position=i;
            }
        }
        System.out.println(highestNumber+"\n"+position);


    }
}
