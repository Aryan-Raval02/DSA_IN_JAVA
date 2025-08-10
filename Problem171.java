public class Problem171 
{
    public static int titleToNumber(String columnTitle) 
    {
        int sum = 0;
        for(int i=0; i<columnTitle.length(); i++)
        {
            int n = columnTitle.charAt(i) - 'A' + 1;
            sum = sum * 26 + n;
        } 
        
        return sum;
    }

    public static void main(String[] args) 
    {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }
}
