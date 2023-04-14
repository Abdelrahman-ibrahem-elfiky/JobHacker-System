package Task2;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String result="";
        String wordFirst=strs[0];

        for (int i = 0; i < wordFirst.length(); i++)
        {
            String count="";
            char w=wordFirst.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                    if (strs[j].length()==i)
                    break;
                  else if (strs[j].charAt(i)==w)
                    count+=w;
            }
            if (count.length()==strs.length)
                result+=w;
            else
                break;
        }
        return result;
    }
    public static void main(String[]args)
    {
        String []str={"flower","flow","flight"};
       System.out.println(longestCommonPrefix(str));

    }
}
