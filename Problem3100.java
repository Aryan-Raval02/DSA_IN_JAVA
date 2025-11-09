public class Problem3100 
{
    public static int maxBottlesDrunk(int numBottles, int numExchange) 
    {
        int drinkBottles = numBottles;
        int emptyBottles = numBottles;

        numBottles = 0;

        while(emptyBottles >= numExchange)
        {    
            numBottles++;
            emptyBottles -= numExchange;
            numExchange++;

            if(emptyBottles < numExchange)
            {
                drinkBottles += numBottles;
                emptyBottles += numBottles;
                numBottles = 0;
            }
        }

        return drinkBottles;
    }    
    public static void main(String[] args) 
    {
        System.out.println(maxBottlesDrunk(13, 6));
        System.out.println(maxBottlesDrunk(10, 3));
    }
}
