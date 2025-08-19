public class Problem191 
{
    public static int hammingWeight(int n) 
    {
        int c = 0;
        while(n!=0)
        {
            if(n%2==1)
            {
                c++;
            }
            n=n/2;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(8));
    }    
}
