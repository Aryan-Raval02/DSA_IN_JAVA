import java.util.HashMap;
import java.util.Map;

public class Problem1446 
{
    public static int maxPower(String s) 
    {
        int max = Integer.MIN_VALUE;
        int c = 1;
        char ch = '0';
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            char ch1 = s.charAt(i+1);

            if(ch == ch1)
            {
                c++;
            }
            else
            {
                if(max < c)
                    max = c;
                    c=1;
            }
        }

        if(max < c)
                    max = c;
        
        return max;

        // Map<Character,Integer> map = new HashMap<>();

        // int c = 1;
        // char ch = '0';
        // for(int i=0; i<s.length()-1; i++)
        // {
        //     ch = s.charAt(i);
        //     char ch1 = s.charAt(i+1);

        //     if(ch == ch1)
        //     {
        //         c++;
        //     }
        //     else
        //     {
        //         map.put(ch, Math.max(c, map.getOrDefault(ch,0)));
        //         c = 1;
        //     }
        // }

        // map.put(ch, Math.max(c, map.getOrDefault(ch,0)));

        // int max = Integer.MIN_VALUE;
        // for(int i : map.values())
        // {
        //     max = Math.max(i, max);
        // }

        // return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
        System.out.println(maxPower("cc"));
    }
}
