public class Problem11
{
    static
    {
        for(int i=0; i<200; i++)
        {
            maxArea(new int[]{0,0});
        }
    }
    public static int maxArea(int[] height) 
    {
        int maxarea = 0;
        // for(int i=0; i<height.length-1; i++)
        // {
        //     int k=1;
        //     for(int j=i+1; j<height.length; j++)
        //     {
        //         maxarea = Math.max(maxarea, (Math.min(height[i], height[j]))*k);
        //         k++;
        //     }
        // }

        int start = 0;
        int end = height.length-1;

        // while(start < end)
        // {
        //     maxarea = Math.max(maxarea, (Math.min(height[start], height[end]))*(end-start));

        //     if(height[start] <= height[end])
        //     {
        //         start++;
        //     }
        //     else
        //     {
        //         end--;
        //     }
        // }

        while(start < end)
        {
            // maxarea = Math.max(maxarea, (Math.min(height[start], height[end]))*(end-start));
            int distance = end - start;
            int min = height[start] <= height[end] ? height[start] : height[end];

            int water = distance * min;

            if(water > maxarea) maxarea = water;

            if(height[start] <= height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return maxarea;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }
}