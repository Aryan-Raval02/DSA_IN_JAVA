import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1207 
{
    public static boolean uniqueOccurrences(int[] arr) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int n : map.values())
        {
            if(set.contains(n))
                return false;
            else    
                set.add(n);
        }

        return true;

        // return set.size() == map.size();

        // if(arr.length == 1)
        //     return true;

        // int[] freq = new int[2002];

        // for(int n : arr)
        // {
        //     freq[n+1000]++;
        // }

        // int max = 0;
        // for(int i : freq)
        // {
        //     max = Math.max(i, max);
        // }

        // int ans[] = new int[max+1];

        // for(int i : freq)
        // {
        //     ans[freq[i]]++;
        // }

        // for(int i : ans)
        // {
        //     if( i > 2 && i != 0)
        //         return false;
        // }

        // return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
    }    
}
