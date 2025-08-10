public class GCD 
{
    public static int gcd(int a, int b)
    {

        // Euclidean Algo
        if( b == 0) return a;
        return gcd(b, a%b);

        // brute-force Algo
        // int min = Math.min(a, b);

        // while(min != 1)
        // {
        //     if(a%min == 0 && b%min==0) return min;
        //     min--;
        // }

        // return 1;
    }
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(gcd(7,13));
    }    
}
