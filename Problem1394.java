public class Problem1394 
{
    public static int findLucky(int[] arr) 
    {
        int[] freq = new int[501];

        for(int n : arr)
        {
            freq[n]++;
        }

        int max = 0;
        for(int i=1; i<freq.length; i++)
        {
            if(i == freq[i])
            {
                max = i;
            }
        }

        if(max == 0) return -1;

        return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(findLucky(new int[]{2,2,3,4}));
    }    
}
