public class Problem1684 
{
    public static int countConsistentStrings(String allowed, String[] words) 
    {
        int counter = 0;
        int[] freq = new int[26];

        for(char ch : allowed.toCharArray())
        {
            freq[ch-'a']++;
        }

        for(String word : words)
        {
            counter += canCheck(freq, word);
        }

        return counter;

    }
    public static int canCheck(int[] allowed, String word)
    {

        for(char ch : word.toCharArray())
        {
            if(allowed[ch-'a']==0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) 
    {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }    
}
