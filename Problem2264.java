public class Problem2264 
{
    public static String largestGoodInteger(String num) 
    {
        char max = 0;
        int index = 0;
        for(int i=0; i<num.length()-2; i++)
        {
            char ch = num.charAt(i);
            if((ch == num.charAt(i+1) && num.charAt(i+2) == ch))
            {
                if(max <= ch)
                {
                    max = ch;
                    index = i;
                }
            }
        }

        if(max != 0) return num.substring(index,index+3);
        return "";
    }

    public static void main(String[] args) 
    {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));
    }    
}
