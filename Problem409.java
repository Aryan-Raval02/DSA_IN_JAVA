public class Problem409 
{
    public static int longestPalindrome(String s) 
    {
        if(s.length() == 1) return 1;

        // int[] cap = new int[26];
        // for(int i=0; i<s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     if( ch >= 'A' && ch <= 'Z')
        //     {
        //         cap[ch-'A']++;
        //     }
        // }   

        // int[] small = new int[26];
        // for(int i=0; i<s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     if( ch >= 'a' && ch <= 'z')
        //     {
        //         small[ch-'a']++;
        //     }
        // } 

        // boolean oneOdd = false;
        // int len = 0;
        
        // for(int c : cap)
        // {
        //     if(!oneOdd && c % 2 == 1)
        //     {
        //         len += c;
        //         oneOdd = true;
        //     }
        //     else if( c % 2 == 1 && c > 2)
        //     {
        //         len = len + c - 1;
        //     }
        //     else if( c % 2 == 0)
        //     {
        //         len += c;
        //     }
        // }

        // for(int sm : small)
        // {
        //     if(!oneOdd && sm % 2 == 1)
        //     {
        //         len += sm;
        //         oneOdd = true;
        //     }
        //     else if( sm % 2 == 1 && sm > 2)
        //     {
        //         len = (len + sm) - 1;
        //     }
        //     else if( sm % 2 == 0)
        //     {
        //         len += sm;
        //     }
        // }

        // return len;

        // Insted of two array use only single frequency array

        int[] freq = new int[128];

        for(char c : s.toCharArray())
        {
            freq[c]++;
        }

        int len = 0;
        boolean oneOdd = false;

        for(int i : freq)
        {
            if(!oneOdd && i % 2 == 1)
            {
                len += i;
                oneOdd = true;
            }
            else if( i % 2 == 1 && i > 2)
            {
                len = (len + i) - 1;
            }
            else if( i % 2 == 0)
            {
                len += i;
            }
        }
        return len;
    }
    public static void main(String[] args) 
    {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("aaaAaaaa"));
    }
}
