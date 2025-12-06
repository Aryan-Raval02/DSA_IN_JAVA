public class Problem2309 {
    public String greatestLetter(String s) {
        
        int[] small = new int[26];
        int[] capital = new int[26];

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {
                small[ch - 'a'] = 1; 
            }
            else
            {
                capital[ch - 'A'] = 1;
            }
        }

        for(int i=25; i>=0; i--)
        {
            if(small[i] == 1 && capital[i] == 1)
            {
                return String.valueOf((char) (i+'A'));
            }
        }
        return "";
    }
}
