public class Problem643 {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length == 1 && k == 1) return (double) nums[0];

        int slide = 0;
        for(int i=0; i<k; i++)
        {
            slide += nums[i];
        }

        int max = slide;

        for(int i=k; i<nums.length; i++)
        {
            slide += nums[i] - nums[i-k];
            max = Math.max(max, slide);
        }

        return (double) max / k;

        // double ans = Integer.MIN_VALUE;
        // double div = k;
        // for(int i=0; i<=nums.length-k; i++)
        // {
        //     int slide = 0;
        //     for(int j=i; j<i+k; j++)
        //     {
        //         slide += nums[j];
        //     }
        //     ans = Math.max(ans, slide / div);
        // }

        // return ans;
    }
}
