import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2418 
{
    public static String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer, String> map = new HashMap<>();
        int n = names.length;
        
        for(int i=0; i<n; i++)
        {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        int k = 0;
        for(int i=n-1; i>=0; i--)
        {
            names[k] = map.get(heights[i]);
        }

        return names;
    }
    public static void main(String[] args) 
    {
        
    }    
}
