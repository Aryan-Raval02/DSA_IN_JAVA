import java.util.Arrays;

public class Problem151 
{
    public static String reverseWords(String s) 
    {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;

            int start = end;
            
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            
            sb.append(s, start + 1, end + 1).append(" ");
            end = start;
        }
        
        return sb.toString().trim();

        // String[] words = s.trim().split("\\s+");

        // int start = 0, end = words.length-1;

        // while(start < end)
        // {
        //     String temp = words[start];
        //     words[start] = words[end];
        //     words[end] = temp;

        //     start++;
        //     end--;
        // }

        // return String.join(" ", words);
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseWords("  the sky    is blue   "));
    }    
}
