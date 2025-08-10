import java.util.Arrays;

public class Problem414     
{
    public static int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        long max=Long.MAX_VALUE;
        int cnt=0;
        
        for(int i=nums.length-1; i>=0; i--)
        {
            if(cnt < 3 && max > nums[i])
            {
                max=nums[i];
                cnt++;
            }
        }

        if(cnt!=3) return nums[nums.length-1];

        return (int)max;
    }
    public static void main(String[] args) 
    {
        System.out.println(thirdMax(new int[]{3,2,1}));
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{2,2,3,1}));
        System.out.println(thirdMax(new int[]{4,5,4,3,1,4,3,7}));
        System.out.println(thirdMax(new int[]{1,2147483647,-2147483648}));
    }
}
