import java.util.Arrays;

public class Problem1920 
{
    public static int[] buildArray(int[] nums) 
    {
        // int[] ans = new int[nums.length];

        // for(int i=0; i<nums.length; i++)
        // {
        //     ans[i] = nums[nums[i]];
        // }

        // return ans;

        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for(int i=0; i<n; i++)
        {
            nums[i] /= n;
        }

        return nums;

        // int index = 0;
        // int extra;
        // int temp = nums[index];
        // for(int i=0; i<nums.length-1; i++)
        // {
        //     if(index == i)
        //     {
        //         nums[i] = temp;
        //         index = nums[index+1];
        //     }
        //     else
        //     {
        //         extra = temp;
        //         temp = nums[i];
        //         nums[i] = nums[index];
        //     }
        // }

        // // temp = nums[0];
        // // for(int i=0; i<nums.length; i++)
        // // {
        // //     nums[i] = nums[nums[i]];
        // //     nums[nums[i]] = temp;
        // //     temp = nums[i];
        // // }

        // return nums;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
        System.out.println(Arrays.toString(buildArray(new int[]{5,0,1,2,3,4})));
    }    
}
