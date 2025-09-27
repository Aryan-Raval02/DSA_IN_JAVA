public class Problem1913 
{
    public static int maxProductDifference(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int n : nums)
        {
            if(secondMax < n)
            {
                max = secondMax;
                secondMax = n;
            }
            else if(max < n)
            {
                max = n;
            }

            if(secondMin > n)
            {
                min = secondMin;
                secondMin = n;
            }
            else if(min >= n)
            {
                min = n;
            }
        }

        return (max * secondMax) - (min * secondMin);
    }
    public static void main(String[] args) 
    {
        System.out.println(maxProductDifference(new int[]{5,6,2,7,4}));
        System.out.println(maxProductDifference(new int[]{2,2,5,9,7,4,8}));
    }    
}
