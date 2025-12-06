public class Problem896 {
    public boolean isMonotonic(int[] nums) {
        
        boolean increase = true;
        boolean decrease = true;
        for(int i=0; i<nums.length-1; i++)
        {
            if(increase && nums[i] <= nums[i+1])
                increase = true;
            else{
                increase = false;
                break;
            }
        }

        for(int i=0; i<nums.length-1; i++)
        {
            if(decrease && nums[i] >= nums[i+1])
                decrease = true;
            else{
                decrease = false;
                break;
            }
        }

        return increase || decrease;
    }
}
