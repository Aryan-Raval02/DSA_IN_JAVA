public class Problem3300 {
    public int minElement(int[] nums) {
        int min = nums[0];

        for(int i=0; i<nums.length; i++)
        {
            int n = nums[i];
            int sum = 0;
            while(n > 0)
            {
                int m = n % 10;
                sum += m;
                n /= 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}
