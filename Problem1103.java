import java.util.Arrays;

public class Problem1103 
{
    public static int[] distributeCandies(int candies, int num_people) 
    {
        int[] ans = new int[num_people];

        for(int i=0; i<ans.length; i++)
        {
            if(i+1 <= candies)
            {
                ans[i] = i+1;
                candies = candies - (i+1);
            }
            else
            {
                ans[i] = candies;
                candies = 0;
                break;
            }
        }

        if(candies != 0)
            ans[0]+=candies;

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(distributeCandies(7,4)));
        System.out.println(Arrays.toString(distributeCandies(10, 3)));
    }    
}
