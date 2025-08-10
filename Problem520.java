public class Problem520 
{
    public static boolean detectCapitalUse(String word) 
    {
        if(word == null || word.length() == 0) return false;

        boolean all = true;
        boolean camelCase = true;

        boolean cap = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';

        if(cap)
        {
            for(int i=1; i<word.length(); i++)
            {
                all = (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') && all;
                camelCase = (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') && camelCase;
            }
            return all || camelCase;
        }
        else
        {
            for(int i=1; i<word.length(); i++)
            {
                all = (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') && all;
            }

            return all;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(detectCapitalUse("USA")); //true
        System.out.println(detectCapitalUse("Google")); //true
        System.out.println(detectCapitalUse("FlaG")); //false
        System.out.println(detectCapitalUse("gOOGLE")); // false
        System.out.println(detectCapitalUse("GooGle")); //false
        System.out.println(detectCapitalUse("G")); // true
        System.out.println(detectCapitalUse("f")); // true
        System.out.println(detectCapitalUse("")); //false;
    }
}
