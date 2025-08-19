public class Problem2348 
{
    public static long zeroFilledSubarray(int[] nums) 
    {

        int ans = 0;
        int count = 0;

        for(int num : nums)
        {
            if(num == 0)
            {
                count++;
                ans+=count;
            }
            else
                count = 0; 
        }

        return ans;

        // int ans = 0;
        // int zero = 0;
        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums[i] != 0 && zero != 0)
        //     {
        //         ans = ans + (zero * (zero+1)) / 2;
        //         zero = 0;
        //     }
        //     if(nums[i] == 0)
        //     {
        //         zero++;
        //     }
        // }

        // ans = ans + (zero * (zero+1)) / 2;

        // return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
        System.out.println(zeroFilledSubarray(new int[]{0,0,0,2,2,0,0}));
        System.out.println(zeroFilledSubarray(new int[]{2,10,2019}));
    }    
}
