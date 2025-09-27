import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem442 
{
    public static List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();

        for(int n : nums)
        {
            n = Math.abs(n);
            if(nums[n-1] < 0)
            {
                list.add(n);
            }
            nums[n-1] = -nums[n-1];
        }

        return list;

        // List<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();

        // for(int n : nums)
        // {
        //     if(set.contains(n))
        //     {
        //         list.add(n);
        //     }
        //     else
        //     {
        //         set.add(n);
        //     }
        // }

        // return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }    
}
