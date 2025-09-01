public class GeekDSA66 
{
    public static int getSecondLargest(int[] arr)
    {
        int res = -1, max = 0;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > arr[max])
            {
                res = max;
                max = i;
            }

            if(arr[i] != arr[max])
            {
                if(res == -1 || arr[i] > arr[res])
                    res = i;
            }

        }

        return res;
    }
    public static void main(String[] args) 
    {
        System.out.println(getSecondLargest(new int[]{4,7,4,3,8,9}));
        System.out.println(getSecondLargest(new int[]{12,54,34,35}));
        System.out.println(getSecondLargest(new int[]{10,10,10}));
        System.out.println(getSecondLargest(new int[]{20,21,23,43,43,234,21}));
    }    
}
