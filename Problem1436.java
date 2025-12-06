import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1436 {
    public String destCity(List<List<String>> paths) {
        
        Map<String, String> map = new HashMap<>();
        String s = paths.get(0).get(1);

        for(int i=1; i<paths.size(); i++)
        {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        while(map.containsKey(s))
        {
            s = map.get(s);
        }

        return s;
    }
}
