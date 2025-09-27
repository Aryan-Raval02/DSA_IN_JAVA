public class Problem1844 
{
    public static String replaceDigits(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            char c =s.charAt(i);

            if(Character.isDigit(c))
            {
                char shifted = (char) (s.charAt(i-1) + (c-'0'));
                sb.append(shifted);
            }
            else
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(replaceDigits("a1c1e1"));
    }    
}
