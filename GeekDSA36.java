public class GeekDSA36 
{
    public static boolean isBitSet(int n, int k)
    {
        int x = 1;
        for(int i=0; i<(k-1); i++)
        {
            x = x*2;
            if((n&x)!=0)
                return true;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(isBitSet(5, 3));
        System.out.println(isBitSet(4, 3));
        System.out.println(isBitSet(4, 2));
    }    
} 
