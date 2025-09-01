public class Problem121 
{
    public static int maxProfit(int[] prices) 
    {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) 
        {
            if (price < buy) 
            {
                buy = price;
            } else 
            {
                maxProfit = Math.max(maxProfit, price - buy);
            }
        }
        return maxProfit;

        // int buy = 0;
        // for(int i=1; i<prices.length; i++)
        // {
        // if(prices[buy] > prices[i])
        // {
        // buy = i;
        // }
        // }

        // int sell = buy;
        // for(int i=buy; i < prices.length; i++)
        // {
        // if(prices[sell] < prices[i])
        // {
        // sell = i;
        // }
        // }

        // return (prices[sell]-prices[buy]);
    }

    public static void main(String[] args) {
        // System.out.println(maxProfit(new int[]{1,5,3,8,12}));
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}
