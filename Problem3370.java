public class Problem3370 
{
    public static int smallestNumber(int n) 
    {
        char[] binary = Integer.toBinaryString(n).toCharArray();

        for(int i=0; i<binary.length; i++)
        {
            binary[i] = '1';
        }

        return Integer.parseInt(new String(binary), 2);
    }
    public static void main(String[] args) 
    {
        System.out.println(smallestNumber(5));
        System.out.println(smallestNumber(10));
        System.out.println(smallestNumber(3));
    }    
}
