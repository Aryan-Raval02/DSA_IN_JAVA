public class Problem2529 
{
    public static int maximumCount(int[] nums) 
    {
        int pos = 0;
        int neg = 0;

        for(int n : nums)
        {
            if(n>0) pos++;
            if(n<0) neg++;
        }

        return Math.max(pos,neg);
    }
    public static void main(String[] args) 
    {
        
    }    
}
