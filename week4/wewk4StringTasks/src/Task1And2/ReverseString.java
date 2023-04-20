package Task1And2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String word,reverse="";
        word= in.next();
        for (int i = word.length()-1; i>=0 ; i--)
            reverse+=word.charAt(i);
        System.out.print("the reverse of that string: "+reverse);

    }


}
