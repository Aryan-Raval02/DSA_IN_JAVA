public class Problem283
{
    public static void moveZeroes(int[] nums) 
    {
        if(nums.length == 0 || nums.length == 1) return;

        int zero=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[zero++] = nums[i];
            }
        }
        while(zero < nums.length)
        {
            nums[zero++] = 0;
        }

        // int start=0,end=0;

        // while(start < nums.length)
        // {
        //     if(nums[start] != 0)
        //     {
        //         nums[end] = nums[start];
        //         nums[start] = 0;
        //         end++;
        //     }
        //     start++;
        // }
    }
    public static void main(String[] args) 
    {
        moveZeroes(new int[]{0,1,0,3,12});
    }    
}
