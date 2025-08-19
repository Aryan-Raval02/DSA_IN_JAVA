import java.util.Arrays;

public class Problem476 
{
    public static int findComplement(int num) 
    {
        StringBuilder sb = new StringBuilder();
        while(num != 0)
        {
            sb.append(num%2);
            num = num / 2;
        }

        char[] chArr = sb.reverse().toString().toCharArray();
        for(int i=0; i<chArr.length; i++)
        {
            if(chArr[i]=='0')
                chArr[i]='1';
            else
                chArr[i]='0';
        }

        return Integer.parseInt(String.valueOf(chArr),2);
    }
    public static void main(String[] args) 
    {
        System.out.println(findComplement(4));
    }
}
