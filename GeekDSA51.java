public class GeekDSA51 
{
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("abcba",0,4));
        System.out.println(isPalindrome("abc",0,2));
    }

    public static boolean isPalindrome(String str, int start, int end)
    {
        if(start >= end) return true;

        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }
}
