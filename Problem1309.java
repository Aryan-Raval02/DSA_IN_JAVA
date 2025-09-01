public class Problem1309 
{
    public static String freqAlphabets(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            if(ch=='#')
            {
                // int n = Integer.parseInt(s.substring(i-2, i));
                int x = s.charAt(--i)-'0';
                int y = s.charAt(--i)-'0';
                int n = y*10+x;
                sb.append((char)('a'+n-1));
                // i-=2;
            }
            else
            {
                sb.append((char)('a'+(ch-'0'-1)));
            }
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }    
}
