public class Problem3000
{
    public static int areaOfMaxDiagonal(int[][] dimensions) 
    {
        double max = Long.MIN_VALUE;
        int maxArea = 0;

        for(int i=0; i<dimensions.length; i++)
        {
            int temp = dimensions[i][0] * dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            int area = dimensions[i][0]*dimensions[i][1];

            if(max < temp || max == temp && area > maxArea)
            {
                max = temp;
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) 
    {
        System.out.println(areaOfMaxDiagonal(new int[][]{{9,3},{8,6}}));
        System.out.println(areaOfMaxDiagonal(new int[][]{{3,4},{4,3}}));
    }
}
