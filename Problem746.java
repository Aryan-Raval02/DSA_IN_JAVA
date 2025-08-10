public class Problem746 
{
    public static int minCostClimbingStairs(int[] cost) 
    {
        cost[cost.length-1] = 0;

        int sum = 0;

        for(int i=0; i<cost.length; i++)
        {
            
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
        // System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
