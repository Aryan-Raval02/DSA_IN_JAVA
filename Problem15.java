import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 
{
    public static List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>(); 

        // for(int i=0; i<nums.length-2; i++)
        // {
        //     for(int j=i+1; j<nums.length-1; j++)
        //     {
        //         for(int k=j+1; k<nums.length; k++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0)
        //             {
        //                 List<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);

        //                 list.add(l);
        //             }
        //         }
        //     }
        // }

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;

            int start = i+1;
            int end = nums.length-1;

            while(start < end)
            {
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0)
                {
                    list.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    while(start < end && nums[start] == nums[start+1] ) start++;
                    while(start < end && nums[end] == nums[end-1]) end--;
                    start++;
                    end--; 
                }
                else if (sum < 0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}).toString());
    }
}
