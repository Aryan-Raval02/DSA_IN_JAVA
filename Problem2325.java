import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem2325 
{
    public static String decodeMessage(String key, String message) 
    {
        Map<Character, Character> map = new LinkedHashMap<>();

        char f = 'a';
        for(char ch : key.toCharArray())
        {
            if(!map.containsKey(ch) && ch != ' ')
            {
                map.put(ch, f);
                f++;
            }
        }

        StringBuilder res = new StringBuilder();

        for(char ch : message.toCharArray())
        {
            if(ch == ' ')
                res.append(" ");
            else
                res.append(map.get(ch));
        }

        return res.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
