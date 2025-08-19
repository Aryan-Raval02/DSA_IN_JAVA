import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Problem1047 
{
    public static String removeDuplicates(String s) 
    {

        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(!stack.empty() && stack.peek() == ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : stack)
        {
            sb.append(ch);
        }

        return sb.toString();

        // char[] chArr = s.toCharArray();

        // for(int i=0; i<chArr.length-1; i++)
        // {
        //     for(int j=i+1; j<chArr.length; j++)
        //     {
        //         if(chArr[i] == chArr[j])
        //         {
        //             chArr[i]='0';
        //             chArr[j]='0';
        //             break;
        //         }
        //     }
        // }

        // char[] copy = new char[chArr.length];
        // int k = 0;
        // for(int i=0; i<chArr.length; i++)
        // {
        //     if(chArr[i] != '0')
        //     {
        //         copy[k++]=chArr[i];
        //     }
        // }

        // return new String(Arrays.copyOfRange(copy,0,k));

        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<set.size()-1; i++)
        // {
        //     sb.append(set.get(i));
        // }

        // return sb.toString();

        // int[] freq = new int[26];

        // for(int i=0; i<s.length(); i++)
        // {
        //     freq[s.charAt(i)-'a']++;
        // }

        // StringBuilder sb = new StringBuilder();

        // for(int i=0; i<freq.length; i++)
        // {
        //     //if(freq[i]%2==0) continue;
        //     if(freq[i]%2==1)
        //     {
        //         sb.append((char) (i+97));
        //     }
        // }

        // return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }    
}
