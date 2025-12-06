import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palak1
{
    public static void main(String[] args) {
        System.out.println(folder(new String[]{"cricket","cricket","book","cricket","book"}).toString());
    }

    public static List<String> folder(String[] names)
    {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(String s : names)
        {
            int temp = 0;
            if(map.containsKey(s))
            {
                temp = map.get(s);
                map.put(s, map.get(s) + 1);
            }
            else
            {
                map.put(s, 1);
            }
            

            StringBuilder sb = new StringBuilder(s);

            if(temp != 0)
                sb.append(temp);

            ans.add(sb.toString());
        }

        return ans;
    }
}