public class Problem2427 
{
    public static int commonFactors(int a, int b) 
    {
        int common = 0;
        int g = gcd(a, b);

        for(int i=1; i*i <= g; i++)
        {
            if(g%i==0)
            {
                common++;
                if( i != g/i) common++;
            }
        }

        return common;

        // int[] freq = new int[1001];

        // for(int i=1; i*i <= a; i++)
        // {
        //     if(a % i == 0)
        //     {
        //         freq[i]++;
        //         freq[a/i]++;
        //     }
        // }

        // for(int i=1; i*i <= b; i++)
        // {
        //     if(b % i == 0)
        //     {
        //         freq[i]++;
        //         freq[b/i]++;
        //     }
        // }

        // int common = 0;
        // for(int n : freq)
        // {
        //     if(n!=0 && n>1)
        //         common++;
        // }

        // return common;
    }

    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        System.out.println(commonFactors(12, 6));
        System.out.println(commonFactors(25, 30));
    }    
}
