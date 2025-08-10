import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1695 
{
    public static int maximumUniqueSubarray(int[] nums) 
    {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int max=0,start=0,left=0;
        int sum=0;

        List<Integer> arr = new ArrayList<>();
        
        while(start<nums.length)
        {
            if(arr.contains(nums[start]))
            {
                sum-=nums[left];
                arr.remove(nums[left]);
                left++;
            }
            else
            {
                arr.add(nums[start]);
                sum+=nums[start];
                start++;
            }
            if(sum > max) max = sum;
        }

        return max;

        // int max=0,start=0,left=0;
        // int sum=0;

        // Set<Integer> arr = new HashSet<>();
        
        // while(start<nums.length)
        // {
        //     if(arr.contains(nums[start]))
        //     {
        //         sum-=nums[left];
        //         arr.remove(nums[left]);
        //         left++;
        //     }
        //     else
        //     {
        //         arr.add(nums[start]);
        //         sum+=nums[start];
        //         start++;
        //     }
        //     if(sum > max) max = sum;
        // }

        // return max;

        // int max = 0;

        // HashSet<Integer> arr = new HashSet<>();
        // for(int i=0; i<nums.length ; i++)
        // {
        //     int sum = 0;
        //     for(int j=i ; j<nums.length ; j++)
        //     {
        //         if(arr.contains(nums[j]))
        //         {
        //             max = Math.max(max, sum);
        //             arr.clear();
        //             break;
        //         }
        //         else
        //         {
        //             arr.add(nums[j]);
        //             sum += nums[j];
        //         }
        //     }
        //     max = Math.max(max, sum);
        //     arr.clear();
        // }

        // return max;
    }  
    public static void main(String[] args) 
    {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
        System.out.println(maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));    
    }  
}
