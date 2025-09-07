public class Problem918 
{
    public static int normalMaxSubArray(int[] nums) 
    {
        int res = nums[0];
        int maxEnding = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            res = Math.max(maxEnding, res);
        }

        return res;
    }

    public static int maxSubarraySumCircular(int[] nums) 
    {
        int max_normal = normalMaxSubArray(nums);

        if(max_normal < 0)
            return max_normal;

        int arr_sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            arr_sum += nums[i];
            nums[i] = -nums[i];
        }

        int max_circular = arr_sum + normalMaxSubArray(nums);

        return Math.max(max_normal, max_circular);
    }  
    
    public static void main(String[] args) 
    {
        System.out.println(maxSubarraySumCircular(new int[]{1,-2,3,-2}));
        System.out.println(maxSubarraySumCircular(new int[]{5,-3,5}));
        System.out.println(maxSubarraySumCircular(new int[]{-3,-2,-3}));
    }
}
