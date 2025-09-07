import java.util.Arrays;

public class Problem189 
{
    public static void reverse(int[] arr, int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k %= n;

        // int n = nums.length;
        // if (n <= 1) return;   // nothing to rotate

        // k = k % n; // handle k > n
        // if (k == 0) return;   // no rotation needed

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

        // for(int i=0; i<k; i++)
        // {
        //     int temp = nums[nums.length-1];
        //     for(int j=nums.length-1; j>0; j--)
        //     {
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args)
    {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        rotate(new int[]{-1,-100,3,99}, 2);
    }    
}
