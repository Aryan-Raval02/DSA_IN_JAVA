import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem1122 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(int n : arr1)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int n : arr2)
        {
            for(int i=0; i<map.getOrDefault(n,0); i++)
            {
                arr1[index++] = n;
            }
            map.remove(n);
        }

        List<Integer> remaiming = new ArrayList<>(map.keySet());
        Collections.sort(remaiming);

        for(int n : remaiming)
        {
            for(int i=0; i<map.get(n); i++)
            {
                arr1[index++] = n;
            }
            map.remove(n);
        }

        return arr1;

        // Map<Integer, Integer> map = new HashMap<>();
        // Set<Integer> set = new HashSet<>();
        // List<Integer> list = new ArrayList<>();
        // int index = 0;

        // for(int n : arr1)
        // {
        //     map.put(n, map.getOrDefault(n, 0)+1);
        //     set.add(n);
        // }

        // for(int n : arr2)
        // {
        //     if(!set.contains(n))
        //         list.add(n);
        // }

        // Collections.sort(list);

        // for(int n : arr2)
        // {
        //     for(int i=0; i<map.get(n); i++)
        //     {
        //         arr1[index++] = n;
        //     }
        // }

        // for(int n : list)
        // {
        //     for(int i=0; i<map.get(n); i++)
        //     {
        //         arr1[index++] = n;
        //     }
        // }

        // return arr1;
    }
    public static void main(String[] args) 
    {
        
    }    
}
