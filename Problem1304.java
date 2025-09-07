import java.util.Arrays;

public class Problem1304 
{
    public static int[] sumZero(int n) 
    {
        int[] ans = new int[n];

        int start = 0, end = n-1;
        int num = n/2;
        if(n%2==0)
        {
            while(start < end)
            {
                ans[start] = -num;
                ans[end] = num;
                num--;
                start++;
                end--;
            }
        }
        else
        {
            while(start < end)
            {
                ans[start] = -num;
                ans[end] = num;
                num--;
                start++;
                end--;
            }
        }

        if(start == end) ans[start] = 0;

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(4)));
        System.out.println(Arrays.toString(sumZero(1)));
    }
}
