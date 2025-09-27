public class Problem1672 
{
    public static int maximumWealth(int[][] accounts) 
    {
        int wealth = Integer.MIN_VALUE;
        for(int[] nums : accounts)
        {
            int sum = 0;
            for(int num : nums)
            {
                sum += num;
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }
    public static void main(String[] args) 
    {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{1,2,3}}));
    }    
}
