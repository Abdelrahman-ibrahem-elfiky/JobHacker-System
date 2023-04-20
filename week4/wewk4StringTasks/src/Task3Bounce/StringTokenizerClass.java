package Task3Bounce;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int count = 0;
        StringTokenizer tokenizer=new StringTokenizer("hello system job hacker hello");
        System.out.println("Enter word ");
        String word= in.next();
        while (tokenizer.hasMoreTokens())
        {
            if (tokenizer.nextToken().equals(word))
                count++;
        }
        System.out.println("the number of occurrences: "+count);

    }
}