import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2553 
{
    public static int[] separateDigits(int[] nums) 
    {
        int size = 0;

        for(int i : nums)
        {
            while(i>0)
            {
                size++;
                i/=10;
            }
        }

        int[] res = new int[size];

        for(int i=nums.length-1; i>=0; i--)
        {
            int temp = nums[i];

            while(temp > 0)
            {
                res[--size] = temp % 10;
                temp /= 10;
            }
        }

        return res;

        // List<Integer> list = new ArrayList<>();

        // for(int s : nums)
        // {
        //     for(char ch : String.valueOf(s).toCharArray())
        //     {
        //         list.add(ch-'0');
        //     }
        // }

        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(separateDigits(new int[]{13,25,83,77})));
        System.out.println(Arrays.toString(separateDigits(new int[]{5,3,4,2})));
    }    
}
