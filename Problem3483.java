public class Problem3483 
{
    public static int totalNumbers(int[] digits) 
    {
        int[] freq = new int[10];

        for(int digit : digits)
        {
            freq[digit]++;
        }

        int countEven = 0;
        // int countOdd = 0;

        for(int i=0; i<freq.length; i++)
        {
            if(i % 2 == 0 && freq[i]>0)
            {   
                countEven += freq[i];
            }
            // if((f & 1) == 1 && f>0)
            // {
            //     countOdd++;
            // }
        }

        int n = digits.length;

        return fact(n-1,2) * countEven;
    }

    public static int fact(int n, int loop)
    {
        int ans = 1;
        for(int i=0; i<loop; i++)
        {
            ans = ans * n;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        System.out.println(totalNumbers(new int[]{1,2,3,4}));
    }    
}
