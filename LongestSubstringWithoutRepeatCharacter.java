import java.util.HashSet;

public class LongestSubstringWithoutRepeatCharacter 
{
    String ans = "";
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) 
    {
        LongestSubstringWithoutRepeatCharacter l = new LongestSubstringWithoutRepeatCharacter();

        System.out.println("abcabcbb    :"+l.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("bbbbb       :"+l.lengthOfLongestSubstring("bbbbb")); 
        System.out.println("pwwkew      :"+l.lengthOfLongestSubstring("pwwkew"));
    }    
}
