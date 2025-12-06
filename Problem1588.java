public class Problem1588 {
    public static void main(String[] args) {
        System.out.println(new int[]{1,2,3,4,5});
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;

        // This line for single element
        for(int n : arr) ans += n;

        // Other Counting Logic

        
        return ans;
    }
}
