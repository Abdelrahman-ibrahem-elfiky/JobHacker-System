package Task2;

import java.util.Scanner;
import java.util.Vector;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        }
        throw new IllegalArgumentException("return");
    }



    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);

        int arr[]={2,7,11,15};

for(Object l:twoSum(arr,9))
        {
            System.out.println(l);
        }

}
}