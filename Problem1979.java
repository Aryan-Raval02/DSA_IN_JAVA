public class Problem1979 
{
    public static int findGCD(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int n : nums)
        {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        return gcd(max, min);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) 
    {
        
    }    
}
