import java.util.Arrays;

public class Problem977 {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i]*nums[i]; 
        // }
        
        // Arrays.sort(nums);
        
        // return nums;

        int n = nums.length;
        int[] ans = new int[n];

        int start = 0;
        int end = n - 1;

        while(start <= end)
        {
            if(Math.abs(nums[start]) > Math.abs(nums[end]))
            {
                ans[--n] = nums[start] * nums[start];
                start++;
            }
            else
            {
                ans[--n] = nums[end] * nums[end];
                end--;
            }
        }

        return ans;
    }
}
