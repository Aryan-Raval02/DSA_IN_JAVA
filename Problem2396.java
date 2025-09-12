public class Problem2396 
{
    public static boolean isStrictlyPalindromic(int n) 
    {
        // return false;
        for(int i=2; i<=n-2; i++)
        {
            String check = toBase(n, i);
            if(!isPalindrome(check))
            {
                return false;
            }
        }

        return true;
    }
    private static String toBase(int n, int base) 
    {
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            sb.append(n%base);
            n /= base;
        }   
        
        return sb.reverse().toString();
    }
    private static boolean isPalindrome(String s)
    {
        int start = 0, end = s.length()-1;
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        
    }
}
