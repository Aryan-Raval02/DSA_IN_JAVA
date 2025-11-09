public class Problem316 
{
    public static String removeDuplicateLetters(String s) 
    {
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            if(freq[i] > 0)
            {
                sb.append((char) (97+i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(removeDuplicateLetters("bcabc"));
    }    
}
