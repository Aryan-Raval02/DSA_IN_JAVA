import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem139 {
    public static boolean wordBreak(String s, List<String> wordDict) {

        List<Boolean> checks = new ArrayList<>();

        for(int i=0; i<wordDict.size(); i++){
            String temp = wordDict.get(i);
            if(s.contains(temp)){
                s = s.replaceAll(temp, "");
                checks.add(true);
                continue;
            }
            checks.add(false);
        }

        for(Boolean b : checks){
            if(!b) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", Arrays.asList("leet","code")));
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple","pen")));
        System.out.println(wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }
}
