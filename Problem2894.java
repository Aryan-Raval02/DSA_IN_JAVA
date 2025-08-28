public class Problem2894 
{
    public static int differenceOfSums(int n, int m) 
    {
        int diff = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%m == 0)
                diff -= i;
            else
                diff += i;
        }

        return diff;
    }

    public static void main(String[] args) 
    {
        System.out.println(differenceOfSums(10, 3));
        System.out.println(differenceOfSums(5, 6));
        System.out.println(differenceOfSums(5, 1));
    }    
}
