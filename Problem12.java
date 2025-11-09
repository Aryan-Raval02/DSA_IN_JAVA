import java.util.HashMap;
import java.util.Map;

public class Problem12 
{
    public static String intToRoman(int num) 
    {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
               hundreds[(num % 1000) / 100] +
               tens[(num % 100) / 10] +
               ones[num % 10];

        // Map<Integer, String> map = new HashMap<>();
        
        // map.put(1, "I");
        // map.put(2, "II");
        // map.put(3, "III");
        // map.put(4, "VI");
        // map.put(5, "V");
        // map.put(6, "IV");
        // map.put(7, "IIV");
        // map.put(8, "IIIV");
        // map.put(9, "XI");
        // map.put(10, "X");

        // map.put(20, "XX");
        // map.put(30, "XXX");
        // map.put(40, "LX");
        // map.put(50, "L");
        // map.put(60, "XL");
        // map.put(70, "XXL");
        // map.put(80, "XXXL");
        // map.put(90, "CX");
        // map.put(100, "C");

        // map.put(200, "CC");
        // map.put(300, "CCC");
        // map.put(400, "DC");
        // map.put(500, "D");
        // map.put(600, "CD");
        // map.put(700, "CCD");
        // map.put(800, "CCCD");
        // map.put(900, "MC");
        // map.put(1000, "M");

        // map.put(2000, "MM");
        // map.put(3000, "MMM");

        // StringBuilder sb = new StringBuilder();
        // int i = 0;
        // while(num > 0)
        // {
        //     int m = num % 10;
        //     if(i==0)
        //     {
        //         sb.append(map.get(m));
        //     }
        //     else if(i==1)
        //     {
        //         sb.append(map.get(m*10));
        //     }
        //     else if(i==2)
        //     {
        //         sb.append(map.get(m*100));
        //     }
        //     else if(i==3)
        //     {
        //         sb.append(map.get(m*1000));
        //     }
        //     num/=10;
        //     i++;
        // }

        // return sb.reverse().toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(3999));
        System.out.println(intToRoman(1));
    }    
}
