public class Problem1154 
{
    public static int dayOfYear(String date) 
    {
        String[] str = date.split("-");
        int days = Integer.parseInt(str[2]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[0]);

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            daysInMonth[1] = 29;

        int res = 0;
        for(int i=0; i<month-1; i++)
        {
            res += daysInMonth[i];
        }

        res += days;

        return res;
    }
    public static void main(String[] args) 
    {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }    
}
