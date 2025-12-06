public class Problem1572 {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];

            sum += mat[i][n - i - 1];
        }

        if (n % 2 == 1) {
            int mid = n / 2;
            sum -= mat[mid][mid];
        }

        return sum;

        // int ans = 0;
        // for(int i=0; i<mat.length; i++)
        // {
        //     for(int j=0; j<mat[i].length; j++)
        //     {
        //         if(i==j)
        //             ans += mat[i][j];
        //     }
        // }

        // for(int i=mat.length-1; i>=0; i--)
        // {
        //     for(int j=mat[i].length-1; j>=0; j--)
        //     {
        //         if (i + j == mat.length - 1)
        //             ans += mat[i][j];
        //     }
        // }

        // if(mat.length % 2 == 1)
        // {
        //     int index = mat.length / 2;
        //     ans -= mat[index][index];
        // }

        // return ans;
    }
}
