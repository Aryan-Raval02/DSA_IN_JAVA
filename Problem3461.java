import java.util.Arrays;

public class Problem3461 {

    public static void main(String[] args) {
        Problem3461 obj = new Problem3461();

        System.out.println(obj.hasSameDigits("34789"));
    }

    public boolean hasSameDigits(String s) {
        
        char[] ans = hasSame(s.toCharArray());

        if(ans[0] == ans[1]) return true;
        return false;
    }
    private  char[] hasSame(char[] arr)
    {
        int n = arr.length;
        if(n == 2)
            return arr;

        for(int i=0; i<n-1; i++)
        {
            int r = arr[i]-'0';
            int l = arr[i+1]-'0';
            int ans = (r + l) % 10;

            arr[i] = (char) (ans + '0');
        }

        return hasSame(Arrays.copyOf(arr, n-1));
    }
}
