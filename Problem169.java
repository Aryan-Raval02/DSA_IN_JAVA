import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Problem169 
{
    public static int majorityElement(int[] nums) 
    {
        // 1 - Brute Force
        // 2 - Sorting and Counting
        // 3 - Moore's Algorithm

        // if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int res = 0;
        int count = 1;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[res] == nums[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                res = i;
                count = 1;
            }
        }

        count = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[res] == nums[i])
                count++;
        }

        if(count <= (nums.length/2))
        {
            return -1;
        }

        return nums[res];

        // HashMap<Integer,Integer> table = new HashMap<>();
        // int counter = 1,max=0;

        // for(int i=0; i<nums.length; i++)
        // {
        //     if(table.containsKey(nums[i]))
        //     {
        //         table.put(nums[i],table.get(nums[i])+1);
        //         if(counter < table.get(nums[i]))
        //         {
        //             counter++;
        //             max = nums[i];
        //         }
        //     }
        //     else
        //     {
        //         table.put(nums[i],1);
        //     }
        // }

        // if(counter > nums.length/2) return max;

        // return 0;
    }

    public static void main(String[] args) 
    {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
