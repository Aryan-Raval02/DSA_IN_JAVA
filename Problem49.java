import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem49 
{
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] chArray = strs[i].toCharArray();
            Arrays.sort(chArray);
            String key = new String(chArray);

            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(ans.values());

        // System.out.println(ans.toString());

        // List<List<String>> res = new ArrayList<>();

        // for(Map.Entry<String, List<String>> e : ans.entrySet()){
        //     List<String> list = e.getValue();
        //     res.add(list);
        // }

        // return res;
    }
    public static void main(String[] args) 
    {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).toString());
        System.out.println(groupAnagrams(new String[]{}));
    }    
}
