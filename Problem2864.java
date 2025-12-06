public class Problem2864 {
    public String maximumOddBinaryNumber(String s) {
        
        char[] arr = s.toCharArray();
        int n = arr.length;

        int ones = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == '1')
                ones++;
        }

        if(ones > 0)
        {
            arr[n-1] = '1';
            ones--;
        }

        while(ones > 0)
        {
            arr[ones - 1] = '1';
            ones--;
        }

        return new String(arr);
    }
}
