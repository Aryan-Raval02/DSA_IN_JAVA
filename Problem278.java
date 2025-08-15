public class Problem278 
{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public static int firstBadVersion(int n) {
        
        int start = 1;
        int end = n;

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)) 
                end = mid;
            else
                start = mid + 1;
        }

        return start;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(firstBadVersion(5));
        System.out.println(firstBadVersion(1));
        System.out.println(firstBadVersion(2));
    }    
}
