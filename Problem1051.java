import java.util.Arrays;

public class Problem1051 
{
    public static int heightChecker(int[] heights) 
    {
        int[] expected = heights.clone();

        Arrays.sort(heights);

        int counter = 0;
        for(int i=0; i<heights.length; i++)
        {
            if(heights[i] != expected[i])
                counter++;
        }

        return counter;
    }
    public static void main(String[] args) 
    {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }    
}
