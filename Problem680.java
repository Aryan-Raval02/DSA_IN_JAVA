public class Problem680 {
    public boolean validPalindrome(String s) {
        
        int[] freq = new int[26];
        int odds = 0;
        int n = s.length();

        for(int i=0; i<n; i++)
        {
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++)
        {
            if(freq[i] % 2 == 1)
                odds++;
        }

        if(n % 2 == 0 && odds == 0) return true;
        if(n % 2 == 0 && odds == 2) return true;
        if(n % 2 == 1 && odds == 1) return true;

        return false;
    }
}
