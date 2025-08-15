import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem594
{
    public static int findLHS(int[] nums) 
    {   
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for(int key : map.keySet())
        {
            if(map.containsKey(key + 1))
            {
                max = Math.max(max, map.get(key) + map.get(key + 1));
            }
        }

        return max;

        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();

        // for(int i=0; i<nums.length; i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         map.put(nums[i], (map.get(nums[i])) + 1);
        //     }
        //     else
        //     {
        //         map.put(nums[i], 1);
        //         list.add(nums[i]);
        //     }
        // }

        // if(list.size() == 1) return 0;

        // Collections.sort(list);

        // int max = 0;
        // for(int i=list.size()-1; i>=1; i--)
        // {
        //     if(list.get(i) - list.get(i-1) == 1)
        //     {
        //         int sum = map.get(list.get(i)) + map.get(list.get(i-1));
        //         if(sum > max)
        //         {
        //             max = sum;
        //         }
        //     }
        // }
        // return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(findLHS(new int[]{1,3,2,2,5,2,3,7}));
        System.out.println(findLHS(new int[]{1,2,3,4}));
        System.out.println(findLHS(new int[]{1,1,1,1}));
        System.out.println(findLHS(new int[]{14,20,46,89,8,5,3}));
    }
}