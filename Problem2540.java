import java.util.HashMap;
import java.util.Map;

public class Problem2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        
        // Map<Integer, Integer> map1 = new HashMap<>();
        // Map<Integer, Integer> map2 = new HashMap<>();

        // for(int i=0; i<nums1.length; i++){
        //     map1.put(nums1[i], 1);
        // }
        // for(int i=0; i<nums2.length; i++){
        //     map2.put(nums2[i], 1);
        // }

        // for(int i=0; i<nums1.length; i++){
        //     if(map2.containsKey(nums1[i])){
        //         return nums1[i];
        //     }
        // }

        // return -1;

        int i=0,j=0;
        while(i<nums1.length && j < nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            } else if(nums1[i]<nums2[j]){
                i++;
            } else {
                return nums1[i];
            }
        }
        return -1;
    }
}
