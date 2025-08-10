import java.util.Arrays;

public class Problem350 
{
    public static int[] intersect(int[] nums1, int[] nums2) 
    {
        int[] res = new int[Math.min(nums1.length, nums2.length)];

        int[] temp = new int[1001];

        for(int num : nums1)
        {
            temp[num]++;
        }

        int j=0;
        for(int num : nums2)
        {
            if(temp[num] > 0)
            {
                res[j++]=num;
                temp[num]--;
            }
        }

        return Arrays.copyOfRange(res,0,j);
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
