public class Problem137 
{
    public static int singleNumber(int[] nums) 
    {
        int and = 0;
        int xor = 0;
        for(int num : nums)
        {
            and = (and ^ num) & ~xor;
            xor = (xor ^ num) & ~and;
        }    
        // System.out.println(and+" "+xor);

        return and;
    }    
    public static void main(String[] args) 
    {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}
