import java.util.Arrays;

public class Problem2574 
{
    static 
    {
        for(int i = 0; i < 500; i++) 
        {
            leftRightDifference(new int[] {0});
        }
    }
    public static int[] leftRightDifference(int[] nums) 
    {
        int[] ans = new int[nums.length];
        
        int leftSum = 0;
        int rightSum;

        int totalSum = 0;
        for(int n : nums)
            totalSum +=n;

        for(int i=0; i<nums.length; i++)
        {
            rightSum = totalSum-leftSum-nums[i]; //1,7,3,6,5,6

            ans[i] = Math.abs(rightSum-leftSum);
            // if (leftSum >= rightSum) 
            // {
            //     ans[i] = leftSum - rightSum;
            // } else 
            // {
            //     ans[i] = rightSum - leftSum;
            // }

            leftSum += nums[i];
        }

        return ans;    
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10,4,8,3})));
        System.out.println(Arrays.toString(leftRightDifference(new int[]{1})));
    }    
}
