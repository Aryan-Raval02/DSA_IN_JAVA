public class Problem7 
{
    public static int reverse(int x) 
    {   
        int ans = 0;
        while(x!=0)
        {
            int m = x % 10;

            if( ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10) return 0;

            ans = m + (ans*10);
            x = x/10;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }    
}
