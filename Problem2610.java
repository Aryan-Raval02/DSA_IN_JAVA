import java.util.ArrayList;
import java.util.List;

public class Problem2610 
{
    public static List<List<Integer>> findMatrix(int[] nums) 
    {
        int[] freq = new int[nums.length+1];

        int track = 0;
        for(int n : nums)
        {
            freq[n]++;
            track+=n;
        }

        List<List<Integer>> list = new ArrayList<>();
        while(track > 0)
        {
            List<Integer> li = new ArrayList<>();
            for(int i=1; i<freq.length; i++)
            {
                if(freq[i] > 0)
                {
                    li.add(i);
                    track-=i;
                    freq[i]--;
                }
            }
            list.add(li);
        }

        return list;
    }

    public static void main(String[] args) 
    {
        System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}).toString());
        System.out.println(findMatrix(new int[]{2,1,1}).toString());
        System.out.println(findMatrix(new int[]{1,2,3,4}).toString());
    }
}
