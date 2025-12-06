public class Problem1475 {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(prices[j] <= prices[i])
                {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }

        return prices;

        // int n = prices.length;
        // int[] answer = new int[n];

        // for(int i=0; i<n; i++)
        // {
        //     boolean flag = true;
        //     for(int j=i+1; j<n; j++)
        //     {
        //         if(flag && prices[j] <= prices[i])
        //         {
        //             answer[i] = prices[i] - prices[j];
        //             flag =false;
        //             break;
        //         }
        //     }

        //     if(flag) answer[i] = prices[i];
        // }
        // return answer;
    }
}
