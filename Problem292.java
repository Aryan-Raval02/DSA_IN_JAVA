public class Problem292 
{
    public static boolean canWinNim(int n) 
    {
        if(n%4==0) return false;
        return true;

        // while(true)
        // {
        //     if(n<=3) return true;
        //     else n = n-1;

        //     if(n<=3) return false;
        //     else n = n-1;
        // }
    }   
    public static void main(String[] args) 
    {
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(2));
        System.out.println(canWinNim(6));
    } 
}
