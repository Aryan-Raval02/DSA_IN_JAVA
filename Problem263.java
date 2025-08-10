class Problem263
{
    public static boolean isUgly(int n) 
    {
        if (n <= 0) return false;

        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n = n / prime;
            }
        }

        return n == 1;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
    }
}