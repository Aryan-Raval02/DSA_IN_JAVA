public class Problem258 
{
    public static int addDigits(int num) 
    {
        if(num == 0 || num%10==num) return num;
        int sum = 0;
        while(num!=0)
        {
            int m = num%10;
            sum = sum + m;
            num=num/10;
        }

        return addDigits(sum);
    }
    public static void main(String[] args) 
    {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
        System.out.println(addDigits(13));
        System.out.println(addDigits(49));
    }    
}
