public class Problem4 
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if()

        double sum = 0;

        int counter = 0;

        for(int num : nums1)
        {
            sum = sum + num;
            counter++;
        }

        for(int num : nums2)
        {
            sum = sum + num;
            counter++;
        }

        return sum/counter;

        // int m = nums1.length;
        // int n = nums2.length;

        // int[] x = new int[m+n];
        // int m1=0,n1=0,a,b;

        // for(int i=0;i<m+n;i++){

        //     if(m1<m){
        //         a=nums1[m1];
        //     }else{
        //         a=Integer.MAX_VALUE;
        //     }

        //     if(n1<n){
        //         b=nums2[n1];
        //     }else{
        //         b=Integer.MAX_VALUE;
        //     }

        //     if(a>b){
        //         x[i]=b;
        //         n1++;
        //     }else if(a==b){
        //         x[i]=a;
        //         i++;
        //         x[i]=b;
        //         m1++;
        //         n1++;
        //     }
        //     else{
        //         x[i]=a;
        //         m1++;
        //     }

        // }

        // if((m+n) % 2 == 0){
        //     double ans = 0;
        //     ans = ans + x[((m+n)/2)];
        //     ans = ans + x[((m+n)/2)-1];
        //     return ans/2;
        // }else{
        //     return x[(m+n)/2];
        // }

    }

    public static void main(String[] args) 
    {
        // Test cases
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2})); // 2.0
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // 2.5
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1})); // 1.0
        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{})); // 2.0
        System.out.println(findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0})); // 0.0
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{})); // should handle or throw error
    }
}
