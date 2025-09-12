public class Problem1863 
{
    public static int subsetXORSum(int[] nums) 
    {
        int root = 0;
        int totalSum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            totalSum += nums[i];
            int sum = 0;
            for(int j=i+1; j<n; j++)
            {
                sum = sum ^ nums[j];
                totalSum += sum;
            }
        }

        for(int i=0; i<n; i++)
        {
            root = root ^ nums[i];
        }

        return totalSum+root;
    }
    public static void main(String[] args) 
    {
        System.out.println(subsetXORSum(new int[]{5,1,6}));
    }    
}
