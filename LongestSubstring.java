public class LongestSubstring
{
    String ans = "";

    public String longestPalindrome(String s) {

        if(s==null || s.length()==0) return "";

        ans = s.substring(0,1);

        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                String sub = s.substring(i, j);
                if(checkPalindrome(sub) && ans.length() < sub.length())
                {   
                    ans = sub;
                }
            }
        }
        return ans;
    }
    public static boolean checkPalindrome(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString()))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        LongestSubstring ls = new LongestSubstring();
        
        System.out.println("Longest Substring from 'babad' : "+ls.longestPalindrome("babad"));
        System.out.println("Longest Substring from 'cbbd' : "+ls.longestPalindrome("cbbd"));
    }
}