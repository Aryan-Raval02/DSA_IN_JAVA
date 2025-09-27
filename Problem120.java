import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem120 
{
    public static int minimumTotal(List<List<Integer>> triangle) 
    {
        int n = triangle.size();
        int[] dp = new int[n+1];

        for(int row=n-1; row>=0; row--)
        {
            for(int col=0; col<triangle.get(row).size(); col++)
            {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col+1]);
            }
        }

        return dp[0];

        // int index=0;
        // int sum = 0;
        // for(List<Integer> l : triangle)
        // {
        //     if(l.size() == 1)
        //     {
        //         sum = sum + l.get(index);
        //         // System.out.println(l.get(index));
        //     }
        //     else
        //     {
        //         if(l.size() > index + 1)
        //         {
        //             int min = Math.min(l.get(index), l.get(index + 1));
        //             sum += min;
                    
        //             for(int i=index; i<=index+1; i++)
        //             {
        //                 if(l.get(i) == min)
        //                     index = i;
        //             }
        //             // System.out.println(l.get(index));
        //         }
        //         else
        //         {
        //             sum += l.get(index);
        //             // System.out.println(l.get(index));
        //         }
        //     }
        // }

        // return sum;
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
    }
}
