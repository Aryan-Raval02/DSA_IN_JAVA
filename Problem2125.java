public class Problem2125 
{
    public static int numberOfBeams(String[] bank) 
    {
        int ans = 0;
        int temp = 0;
        
        for(String s : bank)
        {
            int cnt = 0;
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i) == '1') cnt++;
            }

            if(cnt > 0)
            {
                ans += temp * cnt;
                temp = cnt;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(numberOfBeams(new String[]{"011001","000000","010100","001000"}));
    }
}
