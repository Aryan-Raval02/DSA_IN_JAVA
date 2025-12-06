import java.util.Arrays;

public class Problem2974 {
    public int[] numberGame(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i=i+2)
        {
            int a = nums[i];
            int b = nums[i+1];

            ans[i] = b;
            ans[i+1] = a;
        }

        return ans;
    }
}
