public class Problem1351 
{
    public static int countNegatives(int[][] grid) 
    {
        int neg = 0;

        for(int[] row : grid)
        {
            int start = 0;
            int end = row.length-1;

            while(start <= end)
            {
                int mid = ( start + end ) / 2;

                if(row[mid] >= 0)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }

            neg += (row.length - start);
        }

        return neg;
    }
    public static void main(String[] args) 
    {
        
    }    
}
