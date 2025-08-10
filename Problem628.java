import java.util.Arrays;

public class Problem628 
{
    public static void main(String[] args) 
    {
        System.out.println(maximumProduct(new int[]{1,2,3}));
        System.out.println(maximumProduct(new int[]{1,2,3,4}));
        System.out.println(maximumProduct(new int[]{-1,-2,-3}));
    }
    public static int maximumProduct(int[] nums) 
    {
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;

        for(int num : nums)
        {
            if(max < num)
            {
                thirdMax = secondmax;
                secondmax = max;
                max = num;
            }
            else if(secondmax < num)
            {
                thirdMax = secondmax;
                secondmax = num;
            }
            else if(thirdMax < num)
            {
                thirdMax = num;
            }

            if(min > num)
            {
                secondmin = min;
                min = num;
            }
            else if(secondmin > num)
            {
                secondmin = num;
            }
        }

        return Math.max(min*secondmin*max, max*secondmax*thirdMax);

        // Arrays.sort(nums);

        // int max = Integer.MIN_VALUE;

        // if(max < nums[0]*nums[1]*nums[nums.length-1])
        //     max = nums[0]*nums[1]*nums[nums.length-1];

        // if(max < nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3])
        //     max = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        // return max;
    }    
}
