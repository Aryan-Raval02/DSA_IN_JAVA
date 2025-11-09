import java.util.HashSet;
import java.util.Set;

public class Problem961 
{
    public static int repeatedNTimes(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums)
        {
            if(!set.add(n))
            {
                return n;
            }
        }

        return -1;

        // int n = nums.length/2;
        
        // int[] freq = new int[10001];

        // for(int k : nums)
        // {
        //     freq[k]++;
        // }

        // for(int i=0; i<freq.length; i++)
        // {
        //     if(freq[i] == 0) continue;
        //     if(freq[i] == n) return i;
        // }

        // return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
    }    
}
