import java.util.Arrays;
import java.util.List;

public class Problem2859 {

    public static void main(String[] args) {
        System.out.println(sumIndicesWithKSetBits(Arrays.asList(5,10,1,5,2), 1));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        // int ans = 0;
        // for(int i=0; i<nums.size(); i++){
        //     String s = Integer.toBinaryString(i);
            
        //     int c = 0;
        //     for(int j=0; j<s.length(); j++){
        //         char ch = s.charAt(j);
        //         if(ch == '1') c++;
        //     }
        //     if(c == k) ans += nums.get(i);
        // }

        // return ans;

        int ans = 0;
        for(int i=0; i<nums.size(); i++){
            if(Integer.bitCount(i) == k){
                ans += nums.get(i);
            }
        }
        return ans;
    }
}
