public class Problem1437 {
    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[]{1,0,0,0,1,0,0,1}, 0));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int prev = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(prev != -1 && (i-prev-1) < k){
                    return false;
                }
                prev = i;
            }
        }
        return true;
    }
}
