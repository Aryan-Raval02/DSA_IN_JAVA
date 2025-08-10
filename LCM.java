public class LCM 
{
    public static int lcm(int a,int b)
    {
        int res = Math.max(a, b);

        while(true)
        {
            if(res % a == 0 && res % b == 0)
            {
                return res;
            }
            res++;
        }
    }    
    public static void main(String[] args) 
    {
        System.out.println(lcm(12, 8));
        System.out.println(lcm(12,15));
        System.out.println(lcm(3, 7));
    }
}
