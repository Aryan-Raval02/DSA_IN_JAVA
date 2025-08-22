public class Problem1277
{
    public static int countSquares(int[][] matrix) 
    {
        int ans = 0;
        int len = matrix.length;
        int counter = 1;

        for(int k=0; k<counter; k++)
        {
            for(int i=0; i<=k; i++)
            {
                for(int j=0; j<=k; j++)
                {
                    if(matrix[i][j] == 1);
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}}));
    }
}