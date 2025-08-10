import java.util.ArrayList;
import java.util.List;

public class Problem228 
{
    public static List<String> summaryRanges(int[] nums) 
    {
        List<String> list = new ArrayList<>();

        if (nums.length == 0) return list;

        int start = 0;
        int a = nums[start], b = nums[start];
        start++;

        while (start < nums.length) {
            if (nums[start] == b + 1) {
                b = nums[start];
            } else {
                if (a == b) {
                    list.add(String.valueOf(a));
                } else {
                    list.add(a + "->" + b);
                }
                a = b = nums[start];
            }
            start++;
        }

        if (a == b) {
            list.add(String.valueOf(a));
        } else {
            list.add(a + "->" + b);
        }

        return list;
    }

    public static void main(String[] args) 
    {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}).toString());
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}).toString());
    }
}
