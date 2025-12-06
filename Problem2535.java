public class Problem2535 {
    public int differenceOfSum(int[] nums) {
        
        int elementSum = 0;
        int digitSum = 0;

        for(int n : nums)
        {
            elementSum += n;
            while(n > 0)
            {
                int m = n % 10;
                digitSum += m;
                n /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}
