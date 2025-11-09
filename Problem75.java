public class Problem75 {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];

        for(int n : nums)
            freq[n]++;

        int index = 0;
        for(int i=0; i<3; i++){
            int temp = 0;
            while(temp < freq[i]){
                nums[index++] = i;
                temp++;
            }
        }
    }
}
