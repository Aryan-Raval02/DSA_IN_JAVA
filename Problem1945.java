public class Problem1945 
{
    public static int getLucky(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            sb.append(ch-'a'+1);
        }

        for(int i=0; i<k; i++)
        {
            long ans = 0;
            
            for(char ch : sb.toString().toCharArray())
            {
                ans += (int)(ch - '0');
            }

            sb = new StringBuilder(String.valueOf(ans));
        }

        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) 
    {
        System.out.println(getLucky("iiii", 1));
        System.out.println(getLucky("leetcode", 2));
        System.out.println(getLucky("zbax", 2));
    }    
}
