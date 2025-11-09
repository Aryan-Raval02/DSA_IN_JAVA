import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2273 
{
    public static List<String> removeAnagrams(String[] words) 
    {
        List<String> list = new ArrayList<>();
        String prev = "";

        for(String word : words)
        {
            String sorted = sortString(word);
            if(!sorted.equals(prev))
            {
                list.add(word);
                prev = sorted;
            }
        }

        return list;
    }
    private static String sortString(String word) 
    {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) 
    {
        
    }    
}
