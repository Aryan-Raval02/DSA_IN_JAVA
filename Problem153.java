public class Problem153
{
    public static int findMin(int[] nums) 
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int min = start + (end-start) / 2;

            if(nums[min] > nums[end])
            {
                start = min + 1;
            }
            else
            {
                end = min;
            }
        }

        return nums[start];
    }
    public static void main(String[] args) 
    {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
    }
}