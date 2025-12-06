import java.util.List;

public class Problem2828 {
    public boolean isAcronym(List<String> words, String s) {
        
        if(words.size() != s.length()) return false;

        for(int i=0; i<words.size(); i++)
        {
            char left = s.charAt(i);
            char right = words.get(i).charAt(0);

            if(left != right)
                return false;
        }

        return true;
    }
}
