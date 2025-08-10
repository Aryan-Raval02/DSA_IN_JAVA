import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1337 
{
    public static int[] kWeakestRows(int[][] mat, int k) 
    {
        List<int[]> list = new ArrayList<>();
        int j = 0;

        for(int[] m : mat)
        {
            int sum = 0;
            for(int i=0; i<m.length; i++)
            {
                sum = sum + m[i];
            }
            list.add(new int[]{j++,sum});
        }

        list.sort((a,b) -> {
            if(a[1] != b[1]) return a[1]-b[1];
            return a[0]-b[0];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3)));
        System.out.println(Arrays.toString(kWeakestRows(new int[][]{{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}}, 2)));
    }    
}
