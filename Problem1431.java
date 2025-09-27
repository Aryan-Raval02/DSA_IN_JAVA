import java.util.ArrayList;
import java.util.List;

public class Problem1431 
{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> list= new ArrayList<>();

        int maxCandies = Integer.MIN_VALUE;
        for(int candy :candies)
        {
            maxCandies = Math.max(candy, maxCandies);
        }

        for(int candy : candies)
        {
            if(candy + extraCandies >= maxCandies)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }    
}
