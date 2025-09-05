import java.util.Arrays;

// query to dispaly location of an emp working in same designation having same salary if there salary is grater than martin and their department name has exactly one 's'

public class Problem496 
{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        boolean flag = false;
        int check;
        for(int i=0; i<nums1.length; i++)
        {
            check = nums1[i];
            for(int j=0;j<nums2.length; j++)
            {
                if(check == nums2[j]) flag = true;
                if(flag && check < nums2[j])
                {
                    nums1[i] = nums2[j];
                    break;
                }
                else
                {
                    nums1[i] = -1;
                }
            }
            flag = false;
        }

        return nums1;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
    }   
}
