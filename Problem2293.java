import java.util.Arrays;

public class Problem2293 
{
    public static int minMaxGame(int[] nums) 
    {

        int n = nums.length;

        if( n==1 )
            return nums[0];

        int k = 0;

        for(int i=0; i<n; i = i + 2)
        {
            if(k % 2 == 0)
            {
                nums[k++] = Math.min(nums[i], nums[i+1]);
            }
            else
            {
                nums[k++] = Math.max(nums[i], nums[i+1]);
            }
        }

        return minMaxGame(Arrays.copyOf(nums, k));

        // int n = nums.length;

        // if( n==1 )
        //     return nums[0];

        // int[] numsNew = new int[n/2];
        // int k = 0;

        // for(int i=0; i<n; i = i + 2)
        // {
        //     if(k % 2 == 0)
        //     {
        //         numsNew[k++] = Math.min(nums[i], nums[i+1]);
        //     }
        //     else
        //     {
        //         numsNew[k++] = Math.max(nums[i], nums[i+1]);
        //     }
        // }

        // return minMaxGame(numsNew);

        // int n = nums.length;

        // while( n != 1)
        // {
        //     int k = 0;
        //     for(int i=0; i<n; i = i + 2)
        //     {
        //         if(k % 2 == 0)
        //         {
        //             nums[k++] = Math.min(nums[i], nums[i+1]);
        //         }
        //         else
        //         {
        //             nums[k++] = Math.max(nums[i], nums[i+1]);
        //         }
        //     }
        //     n /= 2;
        // }
        // return nums[0];
    }
    public static void main(String[] args) 
    {
        System.out.println(minMaxGame(new int[]{1,3,5,2,4,8,2,2}));
        System.out.println(minMaxGame(new int[]{1}));
    }    
}
