import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem599 
{
    public static String[] findRestaurant(String[] list1, String[] list2) 
    {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<list1.length; i++) map.put(list1[i], i);

        int min = Integer.MAX_VALUE, count = 0;
        for(int i=0; i<list2.length; i++)
        {
            if(map.containsKey(list2[i]))
            {
                int val = map.get(list2[i]);
                if(min > val + i)
                {
                    min = val + i;
                    count = 1;
                }
                else if(min == val + i) count++;
                map.put(list2[i], i+map.get(list2[i]) + 3000);
            }
        }

        String[] str = new String[count];
        int p = 0;

        for(String key : map.keySet())
        {
            if(map.get(key) == min + 3000) str[p++] = key;
        }

        return str;
        // Map<Integer, List<String>> map = new HashMap<>();
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < list1.length; i++) {
        //     for (int j = 0; j < list2.length; j++) {
        //         if (list1[i].equals(list2[j])) {
        //             int sum = i + j;
        //             map.computeIfAbsent(sum, k -> new ArrayList<>()).add(list1[i]);
        //             min = Math.min(min, sum);
        //         }
        //     }
        // }

        // List<String> result = map.get(min);
        // return result.toArray(new String[0]);
    }
    public static void main(String[] args) 
    {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill","Shogun","KFC"};

        String[] ans = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(ans)); 
    }    
}
