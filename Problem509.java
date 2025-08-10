public class Problem509 
{
    public static int fib(int n) 
    {
        int a = 0;
        int b = 1;
        int c = 0;

        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        for(int i=2; i<=n; i++)
        {
            //System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    public static void main(String[] args) 
    {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }    
}
