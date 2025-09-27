public class Problem3005 
{
    public static int maxFrequencyElements(int[] nums) 
    {
        int[] freq = new int[101];

        for(int n : nums)
        {
            freq[n]++;
        }

        int maxOccurence = 0;

        for(int f : freq)
        {
            maxOccurence = Math.max(f, maxOccurence);
        }

        int counter = 0;
        for(int i=1; i<freq.length; i++)
        {
            if(freq[i] == maxOccurence)
                counter++;
        }

        return counter;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
    }    
}
