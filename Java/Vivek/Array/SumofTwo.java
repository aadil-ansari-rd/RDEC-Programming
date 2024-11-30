package Array;

import java.util.ArrayList;

public class SumofTwo {
    public int[] twoSumm(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = nums[i] + nums[j];
                if (target == sum) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        int a=0 , b=a+1 ;
        while(a!=nums.length){
            if(nums[b]==target-nums[a]){
                return new int [] { a, b};
            }
            b++;
            if(b==nums.length){
                a++;
                b=a+1;
            }
        }
        return null ;
    }

    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int  target = 9 ;
        int res[]  = tw
    }
}
