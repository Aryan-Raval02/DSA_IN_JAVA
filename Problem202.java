import java.util.HashSet;
import java.util.Set;

public class Problem202 
{
    public static void main(String[] args) 
    {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(-1));
    }

    public static boolean isHappy(int n) 
    {
        if( n <= 0) return false;

        Set<Integer> set  = new HashSet<>();

        int sum,temp;
        while(n!=1)
        {
            if(set.contains(n)) return false;
            else set.add(n);

            sum = 0;
            temp = n;

            while(temp>0)
            {
                int m = temp%10;
                sum = sum + (m*m);
                temp = temp / 10;
            }

            n = sum;

            if(n==1) return true;
        }

        return false;
    }    
}
