import java.util.PriorityQueue;

public class Problem215
{
    public static int findKthLargest(int[] nums, int k) 
    {

        int[] freq = new int[20001];

        for(int n : nums)
        {
            freq[n+10000]++;
        }

        for(int i=freq.length-1; i>=0; i--)
        {
            if(freq[i] > 0)
            {
                k = k - freq[i];
                if(k<=0) return i-10000;
            }
        }

        return -1;

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // for(int num : nums)
        // {
        //     minHeap.add(num);
        //     if(minHeap.size() > k)
        //     {
        //         minHeap.poll();
        //     }
        // }

        // return minHeap.peek();

        // int max = 0;
        // int res=-10001;
        // for(int i=0; i<k; i++)
        // {
        //     max=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]>nums[max]){
        //             max=j;
        //         }
        //     } 
        //     res=nums[max];
        //     nums[max]=-10001;
        // }

        // return res;

        // int max = Integer.MAX_VALUE;

        // int index=0;
        // for(int i=0; i<k; i++)
        // {
        //     int secondMax = Integer.MIN_VALUE;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(nums[j] >= secondMax && secondMax < max)
        //         {
        //             secondMax = nums[j];
        //             index=j;
        //         }
        //     }
        //     nums[index]=-100001;
        //     max = secondMax;
            
        // }

        // return max;

        // int max = Integer.MAX_VALUE;

        // for(int i=0; i<k; i++)
        // {
        //     int secondMax = Integer.MIN_VALUE;
        //     for(int num : nums)
        //     {
        //         if(num >= secondMax && secondMax < max)
        //             secondMax = num;

        //             System.out.println(secondMax);
        //     }
            
        //     max = secondMax;
            
        // }

        // return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}