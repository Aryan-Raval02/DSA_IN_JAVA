public class Problem2652 
{
    public static int sumOfMultiples(int n) 
    {
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(sumOfMultiples(7));
        System.out.println(sumOfMultiples(10));
        System.out.println(sumOfMultiples(9));
    }    
}
