import java.util.Arrays;

public class Problem3289 
{
    public static int[] getSneakyNumbers(int[] nums) 
    {
        int max = Integer.MIN_VALUE;

        for(int n : nums)
        {
            max = Math.max(n, max);
        }

        int[] freq = new int[max+1];

        for(int n : nums)
        {
            freq[n]++;
        }

        int[] ans = new int[2];
        int c = 0;
        for(int i=0; i<freq.length; i++)
        {
            if(freq[i] > 1)
                ans[c++] = i;
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0,1,1,0})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0,3,2,1,3,2})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));
    }    
}
