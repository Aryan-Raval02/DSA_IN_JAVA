public class Problem1832 
{
    public static boolean checkIfPangram(String sentence) 
    {
        int[] freq = new int[26];

        for(int i=0; i<sentence.length(); i++)
        {
            freq[sentence.charAt(i)-'a']++;
        }

        for(int i : freq)
        {
            if(i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }    
}
