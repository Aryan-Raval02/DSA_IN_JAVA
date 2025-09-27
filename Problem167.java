import java.util.Arrays;

public class Problem167
{
    public static int[] twoSum(int[] numbers, int target) 
    {
        // changed index for 1-indexed Array
        
        int start = 0;
        int end = numbers.length-1;

        while(start < end)
        {
            int sum = numbers[start] + numbers[end];

            if(sum == target) return new int[]{start, end};
            else if(sum > target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0}, -1)));
    }
}