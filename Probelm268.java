public class Probelm268 
{
    public static int missingNumber(int[] nums) 
    {
        int sum = 0;
        for(int i=1; i<=nums.length; i++)
        {
            sum = sum + i;
        }

        for(int x : nums)
        {
            sum = sum - x;
        }

        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,7,5,3,1,0,2,4,6}));
        System.out.println(missingNumber(new int[]{4,6,2,1,0,3}));
        System.out.println(missingNumber(new int[]{-1,0,2,-4,6,7,8}));
    }    
}
