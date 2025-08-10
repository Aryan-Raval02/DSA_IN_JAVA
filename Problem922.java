import java.util.Arrays;

public class Problem922 
{
    public static int[] sortArrayByParityII(int[] nums) 
    {

        int[] ans = new int[nums.length];
        int i=0, j=nums.length -1;

        for(int num : nums)
        {
            if(num%2 == 0)
            {
                ans[i++] = num;
            }
            else
            {
                ans[j--] = num;
            }
        }

        int start = 0, end = ans.length-1;
        int[] res = new int[ans.length];

        for(int v=0; v<nums.length; v++)
        {
            if(v % 2 == 0)
            {
                res[v] = ans[start++];
            }
            else
            {
                res[v] = ans[end--];
            }
        }

        return res;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{2,3})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{3,4})));
    }    
}
