package Task3Bounce;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int count = 0;
        String s="hello system job hacker hello";
        String[] arr = s.split(" ");
        System.out.println("Enter word ");
        String word= in.next();
        for (String l:arr)
            if(l.equals(word))
                count++;
        System.out.println("the number of occurrences: "+count);
    }
}
