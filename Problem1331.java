import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1331 
{
    public static int[] arrayRankTransform(int[] arr) 
    {
        int[] copy = arr.clone();

        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for(int n : copy)
        {
            if(!map.containsKey(n))
            {
                map.put(n, rank);
                rank++;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            copy[i] = map.get(arr[i]);
        }

        return copy;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40,10,20,30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100,100,100})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }    
}
