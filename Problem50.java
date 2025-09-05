public class Problem50 
{
    public static double myPow(double x, int n) 
    {
        if(n==0 || n==0 && x==0) return 1.0d;
        if(n>0 && x==0) return 0.0d;
        if(n>0 && x==1 || n<0 && x==1 && n%2==0) return 1;
        if(n<0 && x==1 && n%2==1) return -1;
        
        long exp = n;
        if(exp < 0)
        {
            x = 1/x;
            exp = -exp;
        }

        double res = 1;
        while(exp > 0)
        {
            if(exp % 2 == 1)
            {
                res *= x;
            }
            x *= x;
            exp = exp / 2;
        }

        return res;
        // if(n>0)
        // {
        //     while(n!=0)
        //     {
        //         res *= x;
        //         n--;
        //     }
        //     return res;
        // }
        // else
        // {
        //     while(n!=0)
        //     {
        //         res *= x;
        //         n++;
        //     }
        //     return 1/res;
        // }
    }
    public static void main(String[] args) 
    {
        System.out.println(myPow(2.00000d, 10));   // 1024.0
        System.out.println(myPow(2.10000d, 3));    // 9.261
        System.out.println(myPow(2.00000d, -2));   // 0.25
        System.out.println(myPow(0, 5));           // 0.0
        // System.out.println(myPow(0, -3));       // throws ArithmeticException
        System.out.println(myPow(0, 0));   
    }    
}
