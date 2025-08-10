public class Problem9 
{
    public static boolean isPalindrome(int x) 
    {
        if(x < 0) return false;
        
        int ans = 0,n=x;
        while(n!=0)
        {
            int m = n % 10;
            ans = m + (ans*10);
            n = n/10;
        } 
        if(x==ans) return true;
        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(5));
    }    
}
