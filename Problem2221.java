public class Problem2221 
{
    public static int triangularSum(int[] nums) 
    {
        return find(nums, nums.length);

        // if(nums.length == 1)
        // {
        //     return nums[0];
        // }

        // int n = nums.length;

        // for(int i=n-1; i>=0; i--)
        // {
        //     for(int j=0; j<i; j++)
        //     {
        //         int sum = nums[j] + nums[j+1];
        //         if(sum > 9)
        //         {
        //             nums[j] = sum % 10;
        //         }
        //         else
        //         {
        //             nums[j] = sum;
        //         }
        //     }
        // }

        // return nums[0];
    }

    public static int find(int[] nums, int n)
    {
        if(n==1) return nums[0];

        for(int i=0; i<n-1; i++)
        {
            nums[i] = (nums[i] + nums[i+1]) % 10;
        }

        return find(nums, n-1);
    }

    public static void main(String[] args) 
    {
        System.out.println(triangularSum(new int[]{1,2,3,4,5}));
        System.out.println(triangularSum(new int[]{5}));
    }    
}
