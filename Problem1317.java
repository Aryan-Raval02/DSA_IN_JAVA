import java.util.Arrays;

public class Problem1317 
{
    public static int[] getNoZeroIntegers(int n) 
    {
        // int start = 1;
        // int end = n-1;

        // while(start <= end)
        // {
        //     if(start + end < n || String.valueOf(start).indexOf("0") != -1)
        //     {
        //         start++;
        //     }
        //     else if(start + end > n || String.valueOf(end).indexOf("0") != -1)
        //     {
        //         end--;
        //     }
        //     else
        //     {
        //         return new int[]{start,end};
        //     }
        // }

        // return new int[]{-1,-1};

        int start = 1;
        int end = n-1;

        while(start <= end)
        {
            if(start + end < n || isContainsZero(start))
            {
                start++;
            }
            else if(start + end > n || isContainsZero(end))
            {
                end--;
            }
            else
            {
                return new int[]{start,end};
            }
        }

        return new int[]{-1,-1};
    }

    public static boolean isContainsZero(int x)
    {
        while(x > 0)
        {
            if(x % 10 == 0)
                return true;

            x = x / 10;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(getNoZeroIntegers(2)));
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
    }    
}
