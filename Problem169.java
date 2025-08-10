import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Problem169 
{
    public static int majorityElement(int[] nums) 
    {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        HashMap<Integer,Integer> table = new HashMap<>();
        int counter = 1,max=0;

        for(int i=0; i<nums.length; i++)
        {
            if(table.containsKey(nums[i]))
            {
                table.put(nums[i],table.get(nums[i])+1);
                if(counter < table.get(nums[i]))
                {
                    counter++;
                    max = nums[i];
                }
            }
            else
            {
                table.put(nums[i],1);
            }
        }

        if(counter > nums.length/2) return max;

        return 0;
    }

    public static void main(String[] args) 
    {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
