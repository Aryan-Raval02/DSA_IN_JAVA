public class Problem521 
{
    public static int findLUSlength(String a, String b) 
    {
        return (a.equals(b)) ? -1 : Math.max(a.length(), b.length());
    }
    public static void main(String[] args) 
    {
        System.out.println(findLUSlength("aba", "cdc"));
        System.out.println(findLUSlength("aaa", "bbb"));
        System.out.println(findLUSlength("aaa", "aaa"));
    }    
}
