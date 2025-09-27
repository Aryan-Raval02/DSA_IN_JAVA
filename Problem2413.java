public class Problem2413 
{
    public static int smallestEvenMultiple(int n) 
    {
        if(n % 2 == 0) return n;

        while(n % 2 != 0)
        {
            n = n*2;
        }

        return n;
    }
    public static void main(String[] args) 
    {
        System.out.println(smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple(6));
    }    
}
