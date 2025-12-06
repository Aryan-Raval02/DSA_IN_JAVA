public class Problem2843 {
    public int countSymmetricIntegers(int low, int high) {

        int ans = 0;

        for(int i=low; i<=high; i++)
        {
            String s = String.valueOf(i);
            int len = s.length();

            if(len % 2 == 1)
                continue;

            int half = len/2;
            int left = 0;
            int right = 0;

            for(int j=0; j<half; j++)
                left += s.charAt(j) - '0';

            for(int j=half; j<len; j++)
                right += s.charAt(j) - '0';

            if(left == right)
                ans++;
        }

        return ans;
    }
}
