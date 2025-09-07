import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem229 
{
    public static List<Integer> majorityElement(int[] nums) 
    {
        int c1=0,c2=0,e1=0,e2=0;

        for(int num : nums)
        {
            if(num == e1)
                c1++;
            else if (num == e2)
                c2++;
            else if(c1 == 0)
            {
                e1 = num;
                c1 = 1;
            }
            else if(c2 == 0)
            {
                e2 = num;
                c2 = 1;
            }
            else
            {
                c1--;
                c2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        c1 = 0;
        c2 = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == e1)
                c1++;
            else if(nums[i] == e2)
                c2++;
        }

        if(c1 > nums.length/3) ans.add(e1);
        if(c2 > nums.length/3) ans.add(e2);

        return ans;

        // List<Integer> list = new ArrayList<>();
        // if(nums.length == 0 || nums == null)
        // {
        //     return list;
        // }
        // if( nums.length == 1)
        // {
        //     list.add(nums[0]);
        //     return list;
        // }

        // HashMap<Integer,Integer> table = new HashMap<>();

        // for(int i=0; i<nums.length; i++)
        // {
        //     table.put(nums[i], table.getOrDefault(nums[i], 0)+1);
        // }

        // for(int key : table.keySet())
        // {
        //     if(table.get(key) > (nums.length/3))
        //     {
        //         list.add(key);
        //     }
        // }

        // return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(majorityElement(new int[]{3,2,3}).toString());
        System.out.println(majorityElement(new int[]{1}).toString());
        System.out.println(majorityElement(new int[]{1,2}).toString());
        System.out.println(majorityElement(new int[]{1,2,3,1,2}).toString());
    }    
}
