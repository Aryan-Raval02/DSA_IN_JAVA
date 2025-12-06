import java.util.Arrays;

public class Problem3194 {

    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }

    public static double minimumAverage(int[] nums) {
        
        int n = nums.length;
        double[] arr = new double[n/2];

        Arrays.sort(nums);

        int start = 0;
        int end = n-1;

        int index = 0;
        while(start < end)
        {
            arr[index] = (nums[start] + nums[end])/2.0;
            start++;
            end--;
            index++;
        }

        double ans = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            ans = Math.min(ans, arr[i]);
        }

        return ans;
    }
}
