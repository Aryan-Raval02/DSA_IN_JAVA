import java.util.Vector;

public class Sieve 
{
    public static boolean isPrime(int n) 
    {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    boolean[] prime;
    public void sieve(int n)
    {
        prime = new boolean[n+1];

        for(int i=2; i<=n; i++)
        {
            if(isPrime(i))
                prime[i] = true;
            System.out.println(prime[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Sieve s = new Sieve();
        s.sieve(10);
    }    
}
