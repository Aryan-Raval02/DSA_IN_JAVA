import java.util.HashMap;
import java.util.Map;

public class Problem205 
{
    public static boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length()) return false;

        Map<Character,Character> sets = new HashMap<>();
        Map<Character,Character> sett = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(sets.containsKey(c1))
            {
                if(sets.get(c1) != c2) return false;
            }
            else
            {
                sets.put(c1,c2);
            }

            if(sett.containsKey(c2))
            {
                if(sett.get(c2) != c1) return false;
            }
            else
            {
                sett.put(c2,c1);
            }
        }  
        
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("ab", "aa"));       // false
    }    
}
