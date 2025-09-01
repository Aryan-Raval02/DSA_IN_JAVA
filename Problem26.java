public class Problem26 
{
    public static int removeDuplicates(int[] nums) {
        
        int res = 1;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[res-1])
            {
                nums[res] = nums[i];
                res++;
            }
        }

        return res;

        // int len = nums.length;
        
        // Arrays.sort(nums);
        
        // for(int i=0;i<len-1;i++){
            
        //     if(nums[i]==nums[i+1]){
        //         for(int j=i;j<len-1;j++){
        //             nums[j] = nums[j+1];
        //         }
        //         len--;
        //         i--;
        //     }
            
        // }
        
        // return len;
        
    }
    public static void main(String[] args) 
    {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));   
        System.out.println(removeDuplicates(new int[]{1,1,2})); 
    }    
}
