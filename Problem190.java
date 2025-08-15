public class Problem190 
{
    public static int reverseBits(int n) 
    {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<32)
        {
            if(n < 0 || n%2==0)
            {
                str.append("0");
            }
            if(n%2==1)
            {
                str.append("1");
            }
            n=n/2;
            i++;
        }
        return Integer.parseInt(str.toString(),2);
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseBits(43261596));
    }    
}
