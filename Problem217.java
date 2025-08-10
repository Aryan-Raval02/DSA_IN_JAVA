import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem217 
{
    public static boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        if(nums.length==0 || nums.length==1) return false;

        for(int i=0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // if(nums.length==0 || nums.length==1) return false;
        // else
        // {
        //     for(int i=0; i<nums.length; i++)
        //     {
        //         if(map.containsKey(nums[i]))
        //         {
        //             return true;
        //         }
        //         else
        //         {
        //             map.put(nums[i], 1);
        //         }
        //     }
        //     return false;
        // }
    }
    public static void main(String[] args) 
    {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,1,1,2,3,3,4,2,5}));
    }    
}
