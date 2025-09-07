import java.util.Arrays;

public class Problem771 
{
    public static int numJewelsInStones(String jewels, String stones) 
    {
        int[] freq = new int[52];

        for(int i=0; i<stones.length(); i++)
        {
            char ch = stones.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                freq[ch-'a']++;
            }
            else
            {
                freq[ch-'A'+26]++;
            }
        }

        int ans = 0;
        for(int i=0; i<jewels.length(); i++)
        {
            char ch = jewels.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                ans += freq[ch-'a'];
            }
            else
            {
                ans += freq[ch-'A'+26];
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
