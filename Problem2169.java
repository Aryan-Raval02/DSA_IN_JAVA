public class Problem2169 {
    public static int countOperations(int num1, int num2) {
        int ans = 0;
        if(num1 == num2 && num1 == 0) return 0;
        if(num1 == num2) return 1;

        while(num1>0 && num2>0){
            if(num1 >= num2){
                num1 -= num2;
            }
            else
            {
                num2 -= num1;
            }
            ans++;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countOperations(2, 3));
        System.out.println(countOperations(10, 10));
    }
}
