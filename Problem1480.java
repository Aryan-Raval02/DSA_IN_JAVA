public class Problem1480 
{
    public static int[] runningSum(int[] nums) 
    {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
    public static void main(String[] args) 
    {
        
    }    
}
