import java.util.Arrays;

public class Problem1356 
{
    public static int[] sortByBits(int[] arr) 
    {
        // int[] bits = new int[arr.length];

        // for(int i=0; i<arr.length; i++)
        // {
        //     bits[i] = Integer.bitCount(arr[i]);
        // }

        // System.out.println(Arrays.toString(bits));

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(Integer.bitCount(arr[i]) > Integer.bitCount(arr[j])
                || ((Integer.bitCount(arr[i]) == Integer.bitCount(arr[j]) && arr[i] > arr[j]))
                )
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
    }    
}
