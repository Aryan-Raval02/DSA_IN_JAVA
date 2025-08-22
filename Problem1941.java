import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1941
{
    public static boolean areOccurrencesEqual(String s) 
    {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }

        int c = 0;
        for(int n : freq)
        {
            if(n > 0)
            {
                c = n;
                break;
            }
        }

        for(int n : freq)
        {
            if(n > 0 && n != c) return false;
        }

        return true;

        // int[] freq = new int[26];
        // for(int i=0; i<s.length(); i++)
        // {
        //     freq[s.charAt(i)-'a']++;
        // }

        // System.out.println(Arrays.toString(freq));

        // List<Integer> list = new ArrayList<>();

        // for(int i=0; i<freq.length; i++)
        // {
        //     if(freq[i] != 0)
        //     {
        //         list.add(freq[i]);
        //     }
        // }

        // System.out.println(list.toString());

        // int c = list.get(0);
        // for(int i=1; i<list.size(); i++)
        // {
        //     if(c != list.get(i))
        //     {
        //         return false;
        //     }
        // }

        // return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaacc"));
        System.out.println(areOccurrencesEqual("abcdefghijklmnopqrstuvwxyzz"));
    }
}