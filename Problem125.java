public class Problem125 
{

// ASCII CODE : 
//     A-Z = 65-90
//     a-z = 97-122
    public static boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length() == 1) return true;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                sb.append((char)(ch+32));
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                sb.append(ch);
            }
            else if(ch >= '0' && ch <= '9')
            {
                sb.append(ch);
            }
            else
            {
                continue;
            }
        }

        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        return s1.equals(s2);
    }
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("0P"));
    }
}
