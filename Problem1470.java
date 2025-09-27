import java.util.Arrays;

public class Problem1470 
{
    public static int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[2*n];
        int c = 0;
        
        for(int i=0; i<2*n; i+=2)
        {
            ans[i] = nums[c++];
        }
        for(int i=1; i<2*n; i+=2)
        {
            ans[i] = nums[c++];
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
        System.out.println(Arrays.toString(shuffle(new int[]{1,1,2,2}, 2)));
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
    }    
}
