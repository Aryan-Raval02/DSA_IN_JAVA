import java.util.HashMap;
import java.util.Stack;

public class Problem28 
{
    public static int strStr(String haystack, String needle) 
    {
        int nl = needle.length();
        if(needle.isEmpty() || needle.length() > haystack.length()) return -1;

        for(int i=0;i<=haystack.length()-nl;i++)
        {
            if(haystack.substring(i,i+nl).equals(needle))
            {
                return i;
            }
        }
        // if(haystack.contains(needle))
        // {
        //     return haystack.indexOf(needle);
        // }    
        return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("aryan", "ya"));
    }
}
