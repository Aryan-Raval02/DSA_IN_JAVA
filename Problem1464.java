public class Problem1464 
{
    public static int maxProduct(int[] nums) 
    {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int n : nums)
        {
            if(n >= max)
            {
                secondMax = max;
                max = n;
            }
            else if(n >= secondMax)
            {
                secondMax = n;
            }
        }

        return (max-1)*(secondMax-1);
    }
    public static void main(String[] args) 
    {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
        System.out.println(maxProduct(new int[]{1,5,4,5}));
        System.out.println(maxProduct(new int[]{3,7}));
    }    
}
