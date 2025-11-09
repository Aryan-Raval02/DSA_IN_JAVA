import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Problem819 
{
    public static String mostCommonWord(String paragraph, String[] banned) 
    {
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String ans = "";

        for(String s : banned)
        {
            set.add(s.toLowerCase());
        }

        for(String s : paragraph.trim().split("[\\s!?',;.]+"))
        {
            String finalString = s.toLowerCase();

            if(!set.contains(finalString))
            {
                int temp = map.getOrDefault(finalString, 0)+1;
                map.put(finalString, temp);
                
                if(max < temp)
                {
                    max = temp;
                    ans = finalString;
                }
            }
        }

        System.out.println(map.toString());

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
        System.out.println(mostCommonWord("a b.b", new String[]{}));
    }    
}
