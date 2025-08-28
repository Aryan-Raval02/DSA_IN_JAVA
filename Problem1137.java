public class Problem1137 
{
    public static int tribonacci(int n) 
    {
        int a = 0;
        int b = 1;
        int c = 1;

        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        
        int d = 0;
        for(int i=3; i<=n; i++)
        {
            d = a+b+c;
            a = b;
            b = c;
            c = d;
        }

        return d;
    }
    public static void main(String[] args) 
    {
        System.out.println(tribonacci(4)); 
        System.out.println(tribonacci(25));   
    }    
}
