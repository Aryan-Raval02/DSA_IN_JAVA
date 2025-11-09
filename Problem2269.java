public class Problem2269 
{
    public static int divisorSubstrings(int num, int k) 
    {
        String str = String.valueOf(num);
        int count = 0;

        for(int i=0; i<str.length()-k+1; i++)
        {
            int div = Integer.parseInt(str.substring(i, i+k));

            if(div != 0 && num % div == 0)
                count++;
        }

        return count;
    }
    public static void main(String[] args) 
    {
        System.out.println(divisorSubstrings(240, 2));
        System.out.println(divisorSubstrings(430043, 2));
    }    
}
