import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1408 {
    public List<String> stringMatching(String[] words) {
        
        Set<String> list = new HashSet<>();

        for(int i=0; i<words.length; i++)
        {
            for(int j=0; j<words.length; j++)
            {
                if(i == j) continue;
                if(words[j].contains(words[i]))
                {
                    list.add(words[i]);
                }
            }
        }
        return new ArrayList<>(list);
    }
}
