public class Problem1652 {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] res = new int[n];

        if (k == 0)
            return res;

        int sum = 0;

        if (k > 0) 
        {
            for (int i = 1; i <= k; i++) 
            {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) 
            {
                res[i] = sum;

                sum -= code[(i + 1) % n];

                sum += code[(i + k + 1) % n];
            }

        } 
        else 
        {
            k = -k;

            for (int i = n - k; i < n; i++) 
            {
                sum += code[i];
            }

            for (int i = 0; i < n; i++) 
            {
                res[i] = sum;

                sum -= code[(n + (i - k)) % n];

                sum += code[(n + (i - 1)) % n];
            }
        }

        return res;
    }
}
