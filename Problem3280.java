public class Problem3280 
{
    public static String convertDateToBinary(String date) 
    {
        String[] format = date.split("-");
        int c = 0;
        
        for(String each : format)
        {
            format[c++] = Integer.toBinaryString(Integer.parseInt(each));
        }

        return String.join("-", format);

        // String[] format = date.split("-");
        // int c = 0;

        // for(String each : format)
        // {
        //     int temp = Integer.parseInt(each);
        //     StringBuilder sb = new StringBuilder();
        //     while(temp != 0)
        //     {
        //         sb.append(temp%2);
        //         temp = temp / 2;
        //     }
        //     format[c++] = sb.reverse().toString();
        // }

        // return String.join("-", format);
    }
    public static void main(String[] args) 
    {
        System.out.println(convertDateToBinary("2080-02-29"));
    }    
}
