public class Problem1748 
{
    public static int sumOfUnique(int[] nums) 
    {
        int[] freq = new int[101];

        for(int n : nums)
        {
            freq[n]++;
        }

        int sum = 0;
        for(int i=1; i<freq.length; i++)
        {
            if(freq[i] == 1)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
    }    
}
