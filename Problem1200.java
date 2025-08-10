import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 
{
    public static List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        int diff = 0;
        int min = Integer.MAX_VALUE;
        
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) 
        {
            diff = arr[i+1] - arr[i];

            if (diff < min) 
            {
                min = diff;
                list.clear();
                list.add(Arrays.asList(arr[i], arr[i+1]));
            } 
            else if (diff == min) 
            {
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        // for(int i=0; i<arr.length-1; i++)
        // {
        //     diff = arr[i+1] - arr[i];
        //     if(min > diff) min = diff;
        // }

        // for(int i=0; i<arr.length-1; i++)
        // {
        //     diff = arr[i+1] - arr[i];
        //     if(min == diff)
        //     {
        //         list.add(Arrays.asList(arr[i], arr[i+1]));
        //         // List<Integer> l = new ArrayList<>();
        //         // l.add(arr[i]);
        //         // l.add(arr[i+1]);
        //         // list.add(l);
        //     }
        // }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }    
}
