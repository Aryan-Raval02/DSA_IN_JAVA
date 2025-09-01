public class Problem541 
{
    public static String reverseStr(String s, int k) 
    {
        char[] chArr = s.toCharArray();

        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);

            while (start < end) {
                char temp = chArr[start];
                chArr[start] = chArr[end];
                chArr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(chArr);

        // int start = 0;
        // char[] chArr = s.toCharArray();

        // if(s.length() < k) return new StringBuilder(s).reverse().toString();


        // for(int i=0; i<s.length(); i += 2*k)
        // {
        //     start = i;
        //     int end = i+k;
        //     int c = 0;

        //     if(end > s.length()) return String.valueOf(chArr);

        //     while(start < end)
        //     {
        //         if(c==2) break;
        //         char temp = chArr[start];
        //         chArr[start] = chArr[end-1];
        //         chArr[end-1] = temp;

        //         start++;
        //         end--;
        //         c++;
        //     }
        // }

        // return String.valueOf(chArr);
    }    
    public static void main(String[] args) 
    {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
    }
}
