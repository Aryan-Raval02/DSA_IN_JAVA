public class Problem535 
{
    static private final int SHIFT = 3;
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) 
    {
        StringBuilder sb = new StringBuilder();
        for(char ch : longUrl.toCharArray())
        {
            sb.append((char) (ch + SHIFT));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) 
    {
        StringBuilder sb = new StringBuilder();
        for(char ch : shortUrl.toCharArray())
        {
            sb.append((char) (ch - SHIFT));
        }
        return sb.toString();
    }  

    public static void main(String[] args) 
    {
        System.out.println(encode("https://leetcode.com/problems/design-tinyurl"));    
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl")));
    }
}
