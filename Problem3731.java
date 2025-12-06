import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3731 {
    public List<Integer> findMissingElements(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums)
        {
            min = Math.min(min, n);
            max = Math.max(max, n);
            set.add(n);
        }

        for(int i=min; i<=max; i++)
        {   
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }

        
        return ans;
    }
}
