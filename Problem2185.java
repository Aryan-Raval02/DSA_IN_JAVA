public class Problem2185 {
    public int prefixCount(String[] words, String pref) {
        
        int nas = 0;
        for(int i=0; i<words.length; i++)
        {
            if(words[i].startsWith(pref))
                nas++;
        }
        return nas;
    }
}
