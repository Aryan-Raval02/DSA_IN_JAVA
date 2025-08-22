import java.util.Arrays;

public class Problem248 
{
    public static int[] productExceptSelf(int[] nums) 
    {
        int preProduct = 1;
        int zero = 1;
        int counter = 0;
        boolean allZero = true;
        int[] ans = new int[nums.length];

        for(int n : nums)
        {
            if(n == 0)
            {
                zero = 0;
                counter++;
            }
            else
            {
                allZero = false;
                preProduct *= n;
            }
        }

        if(allZero || counter > 1)
        {
            return ans;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(zero == 1)
            {
                if(nums[i] == 0)
                {
                    ans[i] = 0;
                }
                else
                {
                    ans[i] = preProduct / nums[i];
                }
            }
            else
            {
                if(nums[i] == 0)
                {
                    ans[i] = preProduct;
                }
                else
                {
                    ans[i] = 0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,0})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{0,0})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{0,4,0})));
    }    
}
