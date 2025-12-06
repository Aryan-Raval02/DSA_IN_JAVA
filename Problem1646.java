public class Problem1646 
{
    public int getMaximumGenerated(int n) 
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int max = 1;

        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        for(int i=1; 2*i<=n; i++)
        {
            int first = 2*i;
            nums[first] = nums[i];
            max = Math.max(max, nums[first]);

            int second = 2*i+1;
            if(second <= n)
            {
                nums[second] = nums[i] + nums[i+1];
                max = Math.max(max, nums[second]);
            }
        }

        return max;
    }
}
