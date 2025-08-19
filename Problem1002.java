import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1002
{
    public static List<String> commonChars(String[] words) 
    {

        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);

        for(String str : words)
        {
            int[] freq2 = new int[26];
            for(int i=0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                freq2[ch-'a']++;
            }

            for(int i=0; i<freq.length; i++)
            {
                freq[i] = Math.min(freq[i], freq2[i]);
            }
        }

        System.out.println(Arrays.toString(freq));

        List<String> list = new ArrayList<>();

        for(int i=0; i<freq.length; i++)
        {
            int c = freq[i];
            char ch = (char) (i+97);
            
            int k=0;
            while(k<c)
            {
                list.add(String.valueOf(ch));
                k++;
            }
        }

        return list;

        // int[] freq = new int[26];

        // for(String str : words)
        // {
        //     for(int i=0; i<str.length(); i++)
        //     {
        //         char ch = str.charAt(i);
        //         freq[ch-'a']++;
        //     }
        // }

        // System.out.println(Arrays.toString(freq));

        // List<String> list = new ArrayList<>();

        // for(int i=0; i<freq.length; i++)
        // {
        //     int c = (int) freq[i]/words.length;
        //     char ch = (char) (i+97);
            
        //     int k=0;
        //     while(k<c)
        //     {
        //         list.add(String.valueOf(ch));
        //         k++;
        //     }
        // }

        // return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        //System.out.println(commonChars(new String[]{"cool","lock","cook"}));
    }
}