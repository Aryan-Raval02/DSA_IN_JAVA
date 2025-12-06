import java.util.List;

public class Problem1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        final int index = switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            default -> 2;
        };
        
        int ans = 0;
        for(int i=0; i<items.size(); i++)
        {
            List<String> item = items.get(i);
            if(item.get(index).equals(ruleValue))
                ans++;
        }

        return ans;
    }
}
