import java.util.ArrayList;
import java.util.List;

public class Problem49 
{
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        if(strs.length == 0) 
        {
            l.add("");
            list.add(l);
            return list;
        }

        return list;
    }
    public static void main(String[] args) 
    {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).toString());
        System.out.println(groupAnagrams(new String[]{}));
    }    
}
