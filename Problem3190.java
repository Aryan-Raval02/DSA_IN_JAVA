public class Problem3190 
{
    public static int minimumOperations(int[] nums) 
    {
        int op = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] % 3 == 1 || nums[i] % 3 == 2)
            {
                op++;
            }
        }    

        return op;
    }
    public static void main(String[] args) 
    {
        System.out.println(minimumOperations(new int[]{1,2,3,4}));
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }    
}
