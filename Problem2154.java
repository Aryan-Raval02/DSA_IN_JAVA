public class Problem2154 {
    public int findFinalValue(int[] nums, int original) {
        
        boolean flag = true;

        while(flag)
        {
            flag = search(nums, original);
            original*=2;
        }

        return original/2;
    }

    private boolean search(int[] nums, int original)
    {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == original)
                return true;
        }
        return false;
    }
}
