import java.util.ArrayList;
import java.util.List;

public class Problem1380 
{
    public static List<Integer> luckyNumbers(int[][] matrix) 
    {
        int[] rowMin = new int[matrix.length];

        for(int i=0; i<matrix.length; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++)
            {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin[i] = min;
        }

        List<Integer> list = new ArrayList<>();
        
        int[] colMax = new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix[i].length; j++)
            {
                max = Math.max(max, matrix[j][i]);
            }
            colMax[i]=max;
        }

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j])
                {
                    list.add(matrix[i][j]);
                }   
            }
        }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
        System.out.println(luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));
    }    
}
