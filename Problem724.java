public class Problem724 
{
    public static int pivotIndex(int[] nums) 
    {
        int leftSum = 0;
        int rightSum;

        int totalSum = 0;
        for(int n : nums)
            totalSum +=n;

        for(int i=0; i<nums.length; i++)
        {
            rightSum = totalSum-leftSum-nums[i]; //1,7,3,6,5,6

            if(leftSum == rightSum) return i;

            leftSum += nums[i];
        }

        return -1;

        // for(int i=0; i<nums.length; i++)
        // {
        //     leftSum = 0;
        //     rightSum = 0;
        //     if(i==0)
        //     {
        //         for(int j=1; j<nums.length; j++)
        //         {
        //             rightSum+=nums[j];
        //         }

        //         if(leftSum == rightSum) return i;
        //     }
        //     else if(i==nums.length-1)
        //     {
        //         for(int j=0; j<nums.length-1; j++)
        //         {
        //             leftSum+=nums[j];
        //         }

        //         if(leftSum == rightSum) return i;
        //     }
        //     else
        //     {
        //         for(int j=0; j<i; j++)
        //         {
        //             leftSum+=nums[j];
        //         }
        //         for(int j=i+1; j<nums.length; j++)
        //         {
        //             rightSum+=nums[j];
        //         }
        //         if(leftSum == rightSum) return i;
        //     }
        // }
        // return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }    
}
