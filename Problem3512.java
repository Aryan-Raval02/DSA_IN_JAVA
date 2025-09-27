public class Problem3512 
{
    public static int minOperations(int[] nums, int k) 
    {
        int sum = 0;
        for(int num : nums)
        {
            sum += num;
        }

        return sum%k;

        // int op = 0;

        // if(sum % k == 0) return op;

        // while(sum%k != 0)
        // {
        //     sum--;
        //     op++;
        // }

        // return op;
    }
    public static void main(String[] args) 
    {
        System.out.println(minOperations(new int[]{3,9,7}, 5));   
        System.out.println(minOperations(new int[]{4,1,3}, 4)); 
        System.out.println(minOperations(new int[]{2,3}, 6));
    }    
}
