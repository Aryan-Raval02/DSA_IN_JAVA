public class Problem383 
{
    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] freq = new int[26];
        
        for(char c : magazine.toCharArray())
        {
            freq[c-'a']++;
        }

        for(char c : ransomNote.toCharArray())
        {
            freq[c-'a']--;
            if(freq[c-'a'] < 0) return false;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }    
}
