import java.util.Arrays;

public class Problem806 
{
    public static int[] numberOfLines(int[] widths, String s) 
    {

        int lines = 1;
        int width = 0;

        for (char ch : s.toCharArray()) 
        {
            int w = widths[ch - 'a'];
            if (width + w > 100) 
            {
                lines++;
                width = w;
            } 
            else 
            {
                width += w;
            }
        }

        return new int[]{lines, width};

        // int line = 1;
        // int sum = 0;

        // for(int i=0; i<s.length(); i++)
        // {
        //     char ch = s.charAt(i);
            
        //     if(sum + widths[ch-'a'] > 100)
        //     {
        //         sum = widths[ch-'a'];
        //         line++;
        //     }
        //     else
        //         sum += widths[ch-'a'];
        // }

        // return new int[]{line, sum};
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")));
    }    
}
