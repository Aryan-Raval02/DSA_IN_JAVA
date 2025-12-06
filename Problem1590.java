import java.util.HashSet;
import java.util.Set;

public class Problem1590 {
    public static void main(String[] args) {
        System.out.println(new int[]{3,2,4,1});
    }
    public static int minSubarray(int[] nums, int p) {
        int ans = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            set.add(nums[i]);
        }

        if(sum % p == 0) return ans;
        
        return -1;
    }
}
