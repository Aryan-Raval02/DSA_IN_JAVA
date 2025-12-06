public class Problem1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        
        int product = 1;
        int sum = 0;
        while(n > 0){
            int m = n % 10;
            product *= m;
            sum += m;
            n /=10;
        }

        return product - sum;
    }
}
