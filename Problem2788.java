import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2788 {
    public static List<String> splitWordsBySeparator(List<String> words, String separator) {
        
        List<String> ans = new ArrayList<>();
        String regex = "\\" + separator;
        for(String str : words)
        {
            String[] arr = str.split(regex);
            
            for(String s : arr)
            {
                if(!s.isEmpty())
                    ans.add(s);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(splitWordsBySeparator(Arrays.asList("one.two.three","four.five","six"), ".").toString());
    }
}
