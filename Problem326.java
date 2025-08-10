public class Problem326 
{
    public static boolean isPowerOfThree(int n) 
    {
        // if(n==0 || n==-1)
        // {
        //     return false;
        // }
        // else if(n>0)
        // {
        //     return (1162261467 % n == 0);
        // }
        // else
        // {
        //     return (-1162261467 % n == 0);
        // } 

        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
    public static void main(String[] args) 
    {
        System.out.println(isPowerOfThree(2));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(6));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(45));
        System.out.println("---------------------");
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(-3));
        System.out.println(isPowerOfThree(-9));
        System.out.println(isPowerOfThree(-12));
    }    
}
