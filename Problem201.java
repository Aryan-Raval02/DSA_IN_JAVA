public class Problem201 
{
    public int rangeBitwiseAnd(int left, int right) 
    {
        // if(left == 0 && right == 0) return 0;

        // int ans = left;

        // while(left <= right)
        // {
        //     ans &= ++left;
        // }

        // return ans;

        while( right > left)
        {
            right = right & (right - 1);
        }

        return right;
    }
    public static void main(String[] args) 
    {
        
    }    
}
