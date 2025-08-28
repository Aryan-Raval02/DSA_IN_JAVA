public class Problem392 
{
    public static boolean isSubsequence(String s, String t) 
    {
        if(s.length()==0) return true;

        int sub = 0;
        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i) == s.charAt(sub))
            {
                sub++;
            }
            if(sub == s.length()) return true;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(isSubsequence("abc","ahbdec"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }    
}
