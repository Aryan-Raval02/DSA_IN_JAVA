public class Problem598 {
    public int maxCount(int m, int n, int[][] ops) 
    {

        if(ops.length == 0) return m*n;

        int minM = m;
        int minN = n;

        for(int i=0; i<ops.length; i++)
        {
            int[] check = ops[i];
            minM = Math.min(minM, check[0]);
            minN = Math.min(minN, check[1]);
        }

        return minM * minN;
    }
}
