public class Problem507 
{
    public static boolean checkPerfectNumber(int num) 
    {
        int sum = 1;

        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                sum+=i;
                if(i != num/i) 
                    sum += num/i;
            }
        }

        return sum == num;
    }
    public static void main(String[] args) 
    {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
    }    
}
