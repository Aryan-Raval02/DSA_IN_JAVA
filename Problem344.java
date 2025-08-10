import java.util.Arrays;

public class Problem344 
{
    public static void reverseString(char[] s) 
    {
        int start = 0,end = s.length-1;

        while(start<end)
        {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
        
    }    
    public static void main(String[] args) 
    {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
