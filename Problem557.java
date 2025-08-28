public class Problem557 
{
    public static String reverseWords(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(String rev : s.split(" "))
        {
            sb.append(new StringBuilder(rev).reverse().toString()+" ");
        }

        return sb.toString().trim();

        // StringBuilder sb = new StringBuilder();

        // for(String rev : s.split(" "))
        // {
        //     int start = 0;
        //     int end = rev.length()-1;
        //     char[] chr = rev.toCharArray();

        //     while(start <= end)
        //     {
        //         char temp = chr[start];
        //         chr[start] = chr[end];
        //         chr[end] = temp;
        //         start++;
        //         end--;
        //     }
        //     sb.append(new String(chr)+" ");
        // }

        // return sb.toString().trim();
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }
}
