import java.util.HashSet;
import java.util.Set;

public class Problem287 
{
    public static int findDuplicate(int[] nums) 
    {
        int slow = nums[0];
        int fast = nums[0];

        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) 
    {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }    
}
