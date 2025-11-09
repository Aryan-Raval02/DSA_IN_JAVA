public class Problem2520 
{
    public static int countDigits(int num) 
    {
        int temp = num;
        int ans = 0;
        while(temp > 0)
        {
            int m = temp % 10;
            if(num % m == 0)
            {
                ans++;
            }
            temp= temp/10;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(countDigits(121));
        System.out.println(countDigits(1248));
        System.out.println(countDigits(7));    
    }
}
