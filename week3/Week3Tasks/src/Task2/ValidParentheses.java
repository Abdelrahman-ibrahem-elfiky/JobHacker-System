package Task2;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public  static boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==')'&&!stack.isEmpty()&&stack.peek()=='('
                         ||s.charAt(i)=='}'&&!stack.isEmpty()&&stack.peek()=='{'
                                 ||s.charAt(i)==']'&&!stack.isEmpty()&&stack.peek()=='[')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.empty();

        }

    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        String s="{{[()]}}";
        System.out.println(isValid(s));

    }

}
