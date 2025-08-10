public class Problem69 
{
    public static int mySqrt(int x) 
    {
        if(x==0 || x==1) return x;

        int start=0,end=x,ans=0;

        while(start<=end)
        {
            int mid = start + ( end - start )/2;

            long sq = (long) mid*mid;

            if(sq == x) return mid;
            else if(sq > x) end=mid-1;
            else
            {
                ans=mid;
                start=mid+1;
            } 
        }

        return ans;
    } 
    
    public static void main(String[] args) 
    {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(168));  
        System.out.println(mySqrt(2147483647));  
        System.out.println(mySqrt(2));
    }
}
