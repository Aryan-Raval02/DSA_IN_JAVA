public class GeekDSA54 
{
    public static void subsets(String s, String curr, int i)
    {
        if(i==s.length())
        {
            System.out.println(curr);
            return;
        }

        subsets(s, curr, i+1);
        subsets(s, curr+s.charAt(i), i+1);
    }
    public static void main(String[] args) 
    {
        subsets("ABC", "", 0);
    }

}
