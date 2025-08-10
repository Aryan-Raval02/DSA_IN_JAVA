public class Problem1717 
{
    public static int maximumGain(String s, int x, int y) 
    {
        StringBuilder sb = new StringBuilder(s);
        int sum=0;

        if(x<y)
        {
            for(int i=0; i<sb.length()-2; i++)
            {
                if(sb.substring(i, i+2) == "ba")
                {
                    sb.delete(i,i+2);
                    sum += 5;
                    if(i==0 || i==1) i=-1;
                }
            }
            for(int i=0; i<sb.length()-2; i++)
            {
                if(sb.substring(i, i+2) == "ab")
                {
                    sb.delete(i, i+2);
                    sum+=4;
                    i-=2;
                    if(i==0 || i==1) i=-1;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(maximumGain("cdbcbbaabab", 4, 5));
        // System.out.println(maximumGain("aabbaaxybbaabb", 5, 4));
    }    
}
