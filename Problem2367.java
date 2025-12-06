public class Problem2367 {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if(nums[j] - nums[i] != diff) continue;
                for (int k = j + 1; k < n; k++) {
                    if(nums[k]-nums[j] == diff)
                        ans++;
                }
            }
        }

        return ans;
    }
}
