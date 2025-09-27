import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem575 
{
    public static int distributeCandies(int[] candyType) 
    {
        Set<Integer> set = new HashSet<>();

        for(int type : candyType)
        {
            set.add(type);
        }

        System.gc();
        return Math.min(set.size(), candyType.length/2);

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int type : candyType)
        // {
        //     map.put(type, map.getOrDefault(type, 0)+1);
        // }

        // int n = candyType.length/2;
        // int types = map.size();

        // if(n<types)
        // {
        //     return n;
        // }
        
        // return types;
    }
    public static void main(String[] args) 
    {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }    
}
