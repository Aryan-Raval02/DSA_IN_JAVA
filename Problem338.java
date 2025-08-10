import java.util.Arrays;

public class Problem338 
{
    public static int[] countBits(int n) 
    {
        int[] ans = new int[n+1];

        for(int i=0; i<=n; i++)
        {
            int s = i;
            int counter = 0;
            while(s!=0)
            {
                s = s&(s-1);
                counter++;
            }

            ans[i] = counter;
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits(3)));
    }    
}
