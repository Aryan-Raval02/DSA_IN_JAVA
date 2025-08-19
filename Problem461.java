public class Problem461 
{
    public static int hammingDistance(int x, int y) 
    {
        int xor = x ^ y;
        int diff = 0;

        while(xor != 0)
        {
            if(xor % 2 == 1)
                diff++;
            xor=xor/2;
        }

        return diff;
    }
    public static void main(String[] args) 
    {
        System.out.println(hammingDistance(1, 4));
        System.out.println(hammingDistance(3, 1));
    }    
}
