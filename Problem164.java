import java.util.PriorityQueue;
import java.util.Queue;

public class Problem164 {
    public static void main(String[] args) {
        System.out.println(maximumGap(new int[]{3,6,9,1}));
    }
    public static int maximumGap(int[] nums) {
        int ans = Integer.MIN_VALUE;
        if(nums.length == 1) return 0;
        Queue<Integer> queue = new PriorityQueue<>();

        for(int n : nums) queue.add(n);

        int a = queue.poll();
        int b;

        while(!queue.isEmpty()){
            b = queue.poll();
            ans = Math.max(ans, b-a);
            a = b;
        }

        return ans;
    }
}
