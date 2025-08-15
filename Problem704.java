public class Problem704 
{
    public static int search(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            if(nums[start] == target)
                return start;
            if(nums[end] == target)
                return end;

            start++;
            end--;
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }    
}
