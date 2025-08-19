import java.util.ArrayList;
import java.util.List;

public class Problem448
{
    public static List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int[] freq = new int[nums.length+1];
        List<Integer> list = new ArrayList<>();

        for(int i : nums)
        {
            freq[i]++;
        }    

        for(int i=1; i<freq.length; i++)
        {
            if(freq[i] == 0)
            {
                list.add(i);
            }
        }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
}