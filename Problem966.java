import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem966
{
    public static String[] spellchecker(String[] wordlist, String[] queries) 
    {

        Set<String> exactMatch = new HashSet<>();
        Map<String, String> caseMatch = new HashMap<>();
        Map<String, String> vowelMatch = new HashMap<>();

        for(String word : wordlist)
        {
            exactMatch.add(word);

            String lower = word.toLowerCase();
            caseMatch.putIfAbsent(lower, word);

            String normalized = convertStringToNormalize(word);
            vowelMatch.putIfAbsent(normalized, word);
        }

        String[] ans = new String[queries.length];
        for(int i=0; i<queries.length; i++)
        {
            String q = queries[i];

            if(exactMatch.contains(q))
            {
                ans[i] = q;
            }
            else
            {
                String lower = q.toLowerCase();
                if(caseMatch.containsKey(lower))
                {
                    ans[i] = caseMatch.get(lower);
                }
                else
                {
                    String normalized = convertStringToNormalize(lower);
                    ans[i] = vowelMatch.getOrDefault(normalized, "");
                    // if(vowelMatch.containsKey(normalized))
                    // {
                    //     ans[i] = vowelMatch.get(normalized);
                    // }
                    // else
                    // {
                    //     ans[i] = "";
                    // }
                }
            }
        }

        // for(int i=0; i<queries.length; i++)
        // {
        //     // check for exactly match
        //     String temp = "";
        //     for(int j=0; j<wordlist.length; j++)
        //     {
        //         if(queries[i].equals(wordlist[j]))
        //         {
        //             temp = wordlist[j];
        //             break;
        //         }
        //     }
        //     if(temp.length() != 0)
        //     {
        //         queries[i] = temp;
        //         continue;
        //     }
            
        //     // check for matching with ignoring catch
        //     for(int j=0; j<wordlist.length; j++)
        //     {
        //         if(queries[i].equalsIgnoreCase(wordlist[j]))
        //         {
        //             temp = wordlist[j];
        //             break;
        //         }
        //     }
        //     if( temp.length() != 0)
        //     {
        //         queries[i] = temp;
        //         continue;
        //     }
            
        //     // check for changing vowels
        //     for(int j=0; j<wordlist.length; j++)
        //     {
        //         if(convertStringToNormalize(queries[i]).equals(convertStringToNormalize(wordlist[j])))
        //         {
        //             temp = wordlist[j];
        //             break;
        //         }
        //     }
        //     if(temp.length() != 0)
        //         queries[i] = temp;
        //     else
        //         queries[i] = "";
        // }

        return ans;
    }
    private static String convertStringToNormalize(String word)
    {   
        // return word.toLowerCase().replaceAll("[aeiou]", "*");
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) 
        {
            if (isVowel(arr[i])) 
            {
                arr[i] = '*';
            }
        }
        return new String(arr);
    }
    private static boolean isVowel(char c) 
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(spellchecker(new String[]{"KiTe","kite","hare","Hare"}, new String[]{"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"})));
        System.out.println(Arrays.toString(spellchecker(new String[]{"yellow"}, new String[]{"YellOw"})));
    }
}