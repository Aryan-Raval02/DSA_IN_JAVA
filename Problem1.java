import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 
{
    public static int[] twosum(int[] nums,int target)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int c = target-nums[i];
            if(map.containsKey(c))
            {
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{0,0};
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(twosum(new int[]{2,5,7,11,15}, 16)));
        System.out.println(Arrays.toString(twosum(new int[]{3,2,4}, 6)));    
    }    
}
