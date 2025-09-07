import java.util.Arrays;

public class Probelm1929 
{    
    public static int[] getConcatenation(int[] nums) 
    {
        int n = nums.length;
        
        // int[] ans = new int[2*n];
        // System.arraycopy(nums, 0, ans, 0,n);
        // System.arraycopy(nums, 0, ans, n, n);

        int[] ans = Arrays.copyOf(nums, 2*n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }
}
