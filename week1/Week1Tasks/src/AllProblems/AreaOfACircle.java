package AllProblems;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

       final double PI= 3.14159;
       double area,radius;
        radius= input.nextDouble();
        area=PI*(radius*radius);
        System.out.printf("A=%.4f\n",area);

    }
}
