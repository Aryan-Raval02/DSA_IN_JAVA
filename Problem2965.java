import java.util.Arrays;

public class Problem2965 
{
    public static int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n = grid.length * grid[0].length;
        int[] ans = new int[n+1];
        int[] ans1 = new int[2];

        for(int[] arr : grid)
        {
            for(int i : arr)
            {
                ans[i]++;
            }
        }

        for(int i=1; i<n+1; i++)
        {
            if(ans[i] == 0)
            {
                ans1[1]=i;
            }
            if(ans[i] > 1)
            {
                ans1[0]=i;
            }
        }

        return ans1;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}})));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}})));
    }   
}
