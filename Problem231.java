public class Problem231 
{
    public static boolean isPowerOfTwo(int n) 
    {
        if(n==0 || n==-1)
        {
            return false;
        }
        else if(n>0)
        {
            return ((n&(n-1))==0);
        }
        else
        {
            return ((n&(n+1))==0);
        }    
    }      
    
    public static void main(String[] args) 
    {
        System.out.println(isPowerOfTwo(2));
    }
}
