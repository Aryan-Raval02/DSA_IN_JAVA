import java.util.Arrays;

class Problem242
{
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        // Efficient Method
        for(int i=0; i<s.length(); i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i : freq)
        {
            if(i!=0) return false;
        }

        return true;

        // Naive Method

        // boolean flag = true;

        // for(int i=0; i<s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     freq[ch-'a']++;
        // }

        // for(int i=0; i<t.length(); i++)
        // {
        //     char ch = t.charAt(i);
        //     freq[ch-'a']--;
        // }

        // for(int i : freq)
        // {
        //     flag = flag && (i==0);
        // }

        // return flag;
    }
    public static void main(String[] args) 
    {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("cat","rat"));
    }
}