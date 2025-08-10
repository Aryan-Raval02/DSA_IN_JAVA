import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Queue;

import javax.management.Query;

public class Problem387
{
    // public static int firstUniqChar(String s) 
    // {
    //     Queue<Character> q = new ArrayDeque<>();
    //     HashMap<Character,Integer> hash = new HashMap<>();
    //     for(int i=0; i<s.length(); i++)
    //     {
    //         if(hash.containsKey(s.charAt(i)))
    //         {
    //             hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
    //         }
    //         else
    //         {
    //             hash.put(s.charAt(i),1);
    //             q.add(s.charAt(i));
    //         }
    //     }

    //     for(Character c : q)
    //     {
    //         if(hash.get(c) == 1)
    //         {
    //             return s.indexOf(c);
    //         }
    //     }

    //     return -1;
    // }

    // public static int firstUniqChar(String s) 
    // {
    //     boolean flag = false;
    //     int ans = 0;

    //     for(int i=0; i<s.length(); i++)
    //     {
    //         flag = false;
    //         for(int j=i+1; j<s.length(); j++)
    //         {
    //             if(s.charAt(i) == s.charAt(j))
    //             {
    //                 flag = true;
    //             }
    //             if(!flag && s.charAt(i) != s.charAt(j))
    //             {
    //                 ans = i;
    //             }
    //         }   

    //         if(!flag) return ans;
    //     }

    //     return -1;
    // }

    public static int firstUniqChar(String s) 
    {
        for(int i=0; i<s.length(); i++)
        {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}