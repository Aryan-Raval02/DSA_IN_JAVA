import java.util.ArrayList;
import java.util.Arrays;

public class Problem66
{   
    public static int[] plusOne(int[] digits) 
    {   

        int n = digits.length;

        for(int i=n-1 ; i>=0 ; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] arr = new int[n+1];
        arr[0] = 1;

        return arr;

        // int l = digits.length,i=l-1;
        // digits[l - 1] += 1;

        // while(digits[i] > 9)
        // {
        //     if(i==0) break;
        //     digits[i] = 0;
        //     digits[i-1] += 1;
        //     i--;
        // }
        
        // if(digits[0] > 9)
        // {
        //     int[] arr = new int[l+1];
        //     arr[0] = 1;
        //     arr[1] = 0;
        //     for(int j = 2;j<arr.length ; j++)
        //     {
        //         arr[j] = arr[j-1];
        //     }

        //     return arr;
        // }

        // return digits;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
}
