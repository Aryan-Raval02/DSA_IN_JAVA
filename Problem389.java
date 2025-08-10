import java.util.HashMap;

public class Problem389
{
    public static char findTheDifference(String s, String t)
    {
        char res = 0;
        for(char c : s.toCharArray())
        {
            res^=c;
        }
        for(char c : t.toCharArray())
        {
            res^=c;
        }
        return res;
    }

    // public static char findTheDifference(String s, String t) {
        
    //     if(s.isEmpty()) return t.charAt(0);

    //     HashMap<Character,Integer> map = new HashMap<>();

    //     for(int i=0; i<t.length(); i++)
    //     {
    //         char c = t.charAt(i);
    //         if(map.containsKey(c))
    //         {
    //             map.put(c, map.get(c)+1);
    //         }
    //         else
    //         {
    //             map.put(c, 1);
    //         }
    //     }

    //     for(int i=0; i<s.length(); i++)
    //     {
    //         char c = s.charAt(i);
    //         if(map.containsKey(c))
    //         {
    //             map.put(c, map.get(c)-1);
    //         }
    //         else
    //         {
    //             return c;
    //         }
    //         if(map.get(c) == 0) map.remove(c);
    //     }
        
    //     return map.keySet().iterator().next();
    // }
    public static void main(String[] args) 
    {   
        System.out.println(findTheDifference("abcd", "abcdf"));
        System.out.println(findTheDifference("", "t"));
        System.out.println(findTheDifference("aryan", "naykra"));
    }
}