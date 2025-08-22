import java.util.Arrays;

public class Problem1720 
{
    public static int[] decode(int[] encoded, int first) 
    {   
        int[] decoded = new int[encoded.length+1];
        decoded[0] = first;

        for(int i=1; i<decoded.length; i++)
        {
            decoded[i] = decoded[i-1] ^ encoded[i-1];
        }

        return decoded;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(decode(new int[]{1,2,3}, 1)));
        System.out.println(Arrays.toString(decode(new int[]{6,2,7,3}, 4)));
    }    
}
