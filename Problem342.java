public class Problem342 
{
    public static boolean isPowerOfFour(int n) 
    {
        if(n<=0) return false;

        return (Math.pow(4, 20)%n==0);

        // while(n%4==0)
        // {
        //     n = n/4;
        // }

        // return n==1;
    }    

    public static void main(String[] args) 
    {
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(8));
    }
}
