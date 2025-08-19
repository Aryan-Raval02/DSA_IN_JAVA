import java.util.Arrays;

public class Problem1323
{
    public static int maximum69Number (int num) 
    {
        char[] arr = String.valueOf(num).toCharArray();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == '6')
            {
                arr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(arr));

        // int max = num;

        // String str = String.valueOf(num);
        // int[] arr = new int[str.length()];

        // for(int i=0; i<arr.length; i++)
        // {
        //     arr[i] = str.charAt(i) - '0';
        // }

        // for(int i=0; i<arr.length; i++)
        // {
        //     int temp = arr[i];

        //     if(arr[i] == 9) arr[i]=6;
        //     else arr[i]=9;

        //     StringBuilder sb = new StringBuilder();
        //     for(int n : arr)
        //     {
        //         sb.append(n);
        //     }
        //     int result = Integer.parseInt(sb.toString());

        //     if(max < result) max = result;

        //     arr[i] = temp;
        // }

        // return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9999));
    }
}