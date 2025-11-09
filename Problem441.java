public class Problem441 
{
    public static int arrangeCoins(int n) 
    {
        int i = 1;
        while(n != 0)
        {
            if(i<n)
            {
                n = n - i;
            }
            else if(i == n)
            {
                return i;
            }
            else
            {
                return i-1;
            }
            i++;
        }

        return i;
    }
    public static void main(String[] args) 
    {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(6));
        System.out.println(arrangeCoins(2147483647));
    }    
}
