import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem645 
{
    public static int[] findErrorNums(int[] nums) 
    {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        int common = 0;

        for(int n : nums)
        {
            if(set.contains(n))
                common = n;
            else
                set.add(n);
        }

        for(int i=1; i<=nums.length; i++)
        {
            if(!set.contains(i))
            {
                ans[0] = common;
                ans[1] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{2,2})));
    }    
}
