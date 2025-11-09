public class Problem1518 
{
    public static int numWaterBottles(int numBottles, int numExchange) 
    {
        int blankBottles = numBottles;
        int totalDrink = numBottles;

        while(blankBottles >= numExchange || numBottles != 0)
        {
            numBottles = 0;

            if(blankBottles >= numExchange)
            {
                numBottles = blankBottles / numExchange;
                blankBottles = blankBottles - (numBottles * numExchange);
                System.out.println(numBottles + " " + blankBottles);

                blankBottles += numBottles;
                totalDrink += numBottles;
            }
        }
        return totalDrink+numBottles;
    }
    public static void main(String[] args) 
    {
        System.out.println(numWaterBottles(9, 3));
        System.out.println(numWaterBottles(15, 4));
    }    
}
