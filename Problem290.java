import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem290 
{
    public static boolean wordPattern(String pattern, String s) 
    {
        String[] str = s.split(" ");

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        if(pattern.length() != str.length) return false;

        char ch = '0';

        for(int i=0; i<pattern.length(); i++)
        {
            ch = pattern.charAt(i);
            if(map.containsKey(ch))
            {
                if(!str[i].equals(map.get(ch))) return false;
            }
            else
            {
                if(set.contains(str[i])) return false;
                map.put(ch,str[i]);
                set.add(str[i]);
            }
        }

        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }

}
