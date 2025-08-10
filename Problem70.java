public class Problem70 
{
    public static int climbStairs(int n) 
    {
        int a = 2;
        int b = 3;
        int c = 0;

        if(n==1 || n==2 || n==3) return n;

        for(int i=4; i<=n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
    }
}
