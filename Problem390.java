import java.util.Arrays;

public class Problem390 
{
    public static int lastRemaining(int n) 
    {
        int head = 1;
        int step = 1;
        int remaiming = n;
        boolean left = true;

        while(remaiming > 1)
        {
            if(left || remaiming%2 == 1)
                head += step;

            step *= 2;
            remaiming /= 2;
            left = !left;
        }

        return head;
    }
    // public static int last(int[] nums)
    // {
    //     int n = nums.length;

    //     if(n==1)
    //         return nums[0];

    //     int k = 0;
    //     for(int i=1; i<n; i = i + 2)
    //     {
    //         nums[k++] = nums[i];
    //     }

    //     if( k == 1)
    //         return nums[0];

    //     int j = k/2;
    //     for(int i=k-1; i>=0; i = i - 2)
    //     {
    //         nums[j--] = nums[i];
    //     }

    //     return last(Arrays.copyOf(nums, k/2+1));
    // }
    public static void main(String[] args) 
    {
        System.out.println(lastRemaining(9));
        System.out.println(lastRemaining(6));
        System.out.println(lastRemaining(1));
        System.out.println(lastRemaining(24));
    }    
}
