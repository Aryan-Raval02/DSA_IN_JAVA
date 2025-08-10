import java.util.Arrays;

public class Problem1365 
{
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {

        int[] ans  = new int[101];
        int[] res = new int[nums.length];

        for(int num : nums)
            ans[num]++;

        for(int i=1; i<101; i++)
        {
            ans[i] = ans[i] + ans[i-1];
        }

        for(int i=0; i<nums.length; i++)
        {
            res[i] = (nums[i]==0) ? 0 : ans[nums[i] - 1];
        }

        return res;
        
        // int[] ans = new int[nums.length];
        // int j=0;

        // for(int i=0; i<nums.length; i++)
        // {
        //     int counter = 0;
        //     for(int k=0; k<nums.length; k++)
        //     {
        //         if(i==k) continue;

        //         if(nums[i] > nums[k])
        //         {
        //             counter++;
        //         }
        //     }

        //     ans[j++] = counter; 
        // }

        // return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6,5,4,8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7,7})));
    }
}
