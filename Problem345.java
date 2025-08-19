import java.util.ArrayList;
import java.util.Stack;

public class Problem345 
{
    public static String reverseVowels(String s) 
    {
        Stack<Character> list = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a','e','i','o','u','A','E','I','O','U':
                    list.push(ch);
                    break;
            
                default:
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a','e','i','o','u','A','E','I','O','U':
                    sb.append(list.pop());
                    break;
            
                default:
                    sb.append(ch);
                    break;
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }    
}
