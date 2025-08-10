import java.util.HashSet;
import java.util.Set;

public class Problem219 
{
    static
    {
        for(int i=0; i<500; i++)
        {
            containsNearbyDuplicate(new int[]{0,1,0},1);
        }
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums.length <=1 ) return false;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);

            if(set.size() > k)
            {
                set.remove(nums[i-k]);
            }
        }

        return false;


        // That code are not valuable for large input.
        // for(int i=0;i<nums.length-1; i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if( nums[i] == nums[j] && Math.abs(i-j) <= k)
        //         {
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }    
    public static void main(String[] args) 
    {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));    
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
