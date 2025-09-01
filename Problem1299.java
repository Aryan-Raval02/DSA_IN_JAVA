import java.util.Arrays;

public class Problem1299 
{
    public static int[] replaceElements(int[] arr) // new int[]{17,18,5,4,6,1}
    {
        //int[] ans = new int[arr.length];

        int n = arr.length;
        int max = -1; 

        for(int i=n-1; i>=0; i--)
        {
            int current = arr[i];
            arr[i] = max;
            max = Math.max(max, current);
        }

        return arr;

        // int[] ans = new int[arr.length];

        // for(int i=0; i<arr.length; i++)
        // {
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1; j<arr.length; j++)
        //     {
        //         if(arr[j] > max)
        //         {
        //             max = arr[j];
        //         }
        //     }

        //     ans[i] = max;
        // }

        // ans[ans.length-1] = -1;

        // return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }    
}
