public class Problem1935 
{
    public static int canBeTypedWords(String text, String brokenLetters) 
    {
        
        int[] broken = new int[26];

        for(char c : brokenLetters.toCharArray())
        {
            broken[c-'a']++;
        }

        int ans = 0;
        for(String check : text.split(" "))
        {
            boolean flag = true;
            for(int i=0; i<check.length(); i++)
            {
                if(broken[check.charAt(i)-'a'] > 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("hello wrold", "ad"));
        System.out.println(canBeTypedWords("leet code", "e"));
        System.out.println(canBeTypedWords("leet code", "x"));
    }    
}
