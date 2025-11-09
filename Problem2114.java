public class Problem2114 
{
    public static int mostWordsFound(String[] sentences) 
    {
        int ans = Integer.MIN_VALUE;

        for(String s : sentences)
        {
            int l = 1;
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i) == ' ') l++;
            }

            ans = Math.max(ans, l);
        }

        return ans;

        // int ans = Integer.MIN_VALUE;

        // for(int i=0; i<sentences.length; i++)
        // {
        //     int l = sentences[i].split(" ").length;
        //     ans = Math.max(ans, l);
        // }

        // return ans;
    }
    public static void main(String[] args) 
    {
        
    }    
}
