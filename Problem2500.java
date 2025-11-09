import java.util.Arrays;

public class Problem2500 
{
    public static int deleteGreatestValue(int[][] grid)
    {
        for(int[] row : grid)
        {
            Arrays.sort(row);
        }

        int total = 0;
        int cols = grid[0].length;

        for(int i=cols-1; i>=0; i--)
        {
            int max = 0;
            for(int[] row : grid)
            {
                max = Math.max(row[i], max);
            }

            total += max;
        }

        return total;
    }
    public static void main(String[] args) 
    {
        
    }    
}
