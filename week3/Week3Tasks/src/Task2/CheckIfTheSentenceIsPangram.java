package Task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        Set<Character>list=new HashSet<Character>();
        for (int i = 0; i < sentence.length(); i++)
            list.add(sentence.charAt(i));
       if (list.size()==26)
           return true;
       else
           return false;
    }
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        Set<Character>list=new HashSet<Character>();
        String s="leetcode";
       System.out.println(checkIfPangram(s));






    }
}
