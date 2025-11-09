public class Problem3701 
{
    public static int alternatingSum(int[] nums) 
    {
        int sum = 0;
        int n = nums.length;

        for(int i=0; i<n; i+=2)
        {
            sum += nums[i];
        }
        for(int i=1; i<n; i+=2)
        {
            sum -= nums[i];
        }

        return sum;

        // int sum = 0;
        // int n = nums.length;

        // for(int i=0; i<n; i++)
        // {
        //     if(i%2==0) sum += nums[i];
        //     else sum -= nums[i];
        // }

        // return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(alternatingSum(new int[]{1,3,5,7}));
    }    
}
