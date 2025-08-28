public class Problem2485 
{
    public static int pivotInteger(int n) 
    {
        for(int i=1; i<=n; i++)
        {
            int sum1toi = i*(i+1)/2;
            int sumiton = (n*(n+1)/2) - (((i-1)*i)/2);

            if(sum1toi == sumiton) return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }   
}
