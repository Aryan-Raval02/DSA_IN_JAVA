public class Problem1160 
{   
    public static int countCharacters(String[] words, String chars) 
    {
        int[] freq = new int[26];

        for(char ch : chars.toCharArray())
        {
            freq[ch-'a']++;
        }

        int count = 0;
        for(String s : words)
        {
            if(checkWord(freq, s))
            {
                count += s.length();
            }
        }
        return count;
    }
    public static boolean checkWord(int[] dp, String word)
    {
        int[] copy = dp.clone();
        for(char ch : word.toCharArray())   
        {
            if(--copy[ch-'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }    
}
