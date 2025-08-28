public class Problem657 
{
    public static boolean judgeCircle(String moves) 
    {
        int[] freq = new int[26];

        for(char ch : moves.toCharArray())
        {
            freq[ch-'A']++;
        }

        return ((freq[20] == freq[3]) && (freq[11]==freq[17]));
    }
    public static void main(String[] args) 
    {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));    
    }
}
