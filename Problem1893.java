public class Problem1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] ans = new boolean[51];
        int n = ranges.length;

        for(int i=0; i<n; i++)
        {
            int l = ranges[i][0];
            int r = ranges[i][1];

            for(int j=l; j<=r ;j++)
                ans[j] = true;
        }

        for(int i=left; i<=right; i++)
            if(!ans[i])
                return false;
        
        return true;
    }
}
