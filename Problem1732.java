import java.util.Arrays;

public class Problem1732 
{
    public static int largestAltitude(int[] gain) 
    {
        int preSum = 0;
        for(int n : gain)
        {
            preSum += n;
        }

        int[] altitude = new int[gain.length+1];
        altitude[altitude.length-1] = preSum;

        for(int i=altitude.length-2; i>=0; i--)
        {
            altitude[i] = altitude[i+1] - gain[i];
        }

        preSum = Integer.MIN_VALUE;
        for(int n : altitude)
        {
            if(n > preSum)
            {
                preSum = n;
            }
        }

        return preSum;
    }
    public static void main(String[] args) 
    {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }    
}
