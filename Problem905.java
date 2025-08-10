import java.util.Arrays;

public class Problem905 
{
    public static int[] sortArrayByParity(int[] nums) 
    {
        if(nums.length == 0 || nums.length == 1) return nums;

        // Efficient Method

        int[] ans = new int[nums.length];
        int i=0, j=nums.length -1;

        for(int num : nums)
        {
            if(num%2 == 0)
            {
                ans[i++] = num;
            }
            else
            {
                ans[j--] = num;
            }
        }

        return ans;

        // Naive Method 
        // int[] ans = new int[nums.length];
        // int k=0;

        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums[i] % 2 == 0)
        //     {
        //         ans[k]=nums[i];
        //         nums[i]=0;
        //         k++;
        //     }
        // }

        // for(int j=0; j<nums.length; j++)
        // {
        //     if(nums[j] != 0)
        //     {
        //         ans[k]=nums[j];
        //         k++;
        //     }
        // }

        // return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }    
}
