import java.util.Arrays;

public class Problem2022 
{
    public static int[][] construct2DArray(int[] original, int m, int n) 
    {
        if(m*n != original.length)
            return new int[0][0];

        int[][] ans = new int[m][];

        for(int i=0; i<m; i++)
        {
            ans[i] = Arrays.copyOfRange(original, i*n, i*n + n);
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        
    }    
}
