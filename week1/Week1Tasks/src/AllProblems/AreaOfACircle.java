package AllProblems;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        double pi= 3.14159,area,radius;
        radius= input.nextDouble();
        area=pi*(radius*radius);
        System.out.printf("A=%.4f\n",area);

    }
}
