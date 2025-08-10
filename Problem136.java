import java.util.Arrays;

public class Problem136 
{
    public static int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length-1 ; i++)
        {
            if(nums[i+1] == nums[i])
            {
                i++;
            }
            else return nums[i];
        }

        // if(nums.length == 1 ) return nums[0];

        // for(int i=0 ; i<nums.length ; i++)
        // {
        //     for(int j=0 ; j<nums.length ; j++)
        //     {
        //         if(i==j) continue;
        //         else if(nums[i]==nums[j]) break;
        //     }
        //     return nums[i];
        // }

        return nums[nums.length-1];
    }
    public static void main(String[] args) 
    {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{1}));
        System.out.println(singleNumber(new int[]{4,2,1,2,1}));
        System.out.println(singleNumber(new int[]{2,3,1,3,2}));
    }    
}
