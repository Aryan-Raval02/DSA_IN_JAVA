public class Problem3541 
{
    public static int maxFreqSum(String s) 
    {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int maxVowel = Integer.MIN_VALUE;
        int maxConsonant = Integer.MIN_VALUE;

        for(int i=0; i<freq.length; i++)
        {
            switch(i)
            {
                case 0,4,8,14,20 : maxVowel = Math.max(maxVowel, freq[i]); break;
                default : maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        if(maxVowel == 0 && maxConsonant == 0)
        {
            return 0;
        }

        return maxVowel+maxConsonant;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxFreqSum("successes"));
        System.out.println(maxFreqSum("aeiaeia"));
        System.out.println(maxFreqSum(""));
    }    
}
