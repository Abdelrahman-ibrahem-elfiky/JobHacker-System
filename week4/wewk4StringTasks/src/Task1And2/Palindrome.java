package Task1And2;

import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {

            Scanner in=new Scanner(System.in);

            String word,palindrome="";
            word= in.next();
            for (int i = word.length()-1; i>=0 ; i--)
                palindrome+=word.charAt(i);


            if(palindrome.equals(word))
                System.out.println("yes..palindrome");
            else
                System.out.println("not palindrome");
    }
}
