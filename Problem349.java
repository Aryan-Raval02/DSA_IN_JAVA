import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem349 
{
    public static int[] intersection(int[] nums1, int[] nums2) 
    {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        if(nums1.length > nums2.length)
        {
            for(int i : nums1)
                set.add(i);
            
            for(int x : nums2)
            {
                if(set.remove(x))
                    list.add(x);
            }
        }
        else
        {
            for(int i : nums2)
                set.add(i);
            for(int x : nums1)
            {
                if(set.remove(x))
                    list.add(x);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }    
}
