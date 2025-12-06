import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem451 {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList =
            map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .toList();

        List<Character> sortedValues = sortedList.stream()
            .map(Map.Entry::getKey)
            .toList();

        StringBuilder sb = new StringBuilder();

        for(int i=sortedValues.size()-1; i>=0; i--)
        {
            int temp = 0;
            while(temp < map.get(sortedValues.get(i)))
            {
                sb.append(sortedValues.get(i));
                temp++;
            }
        }

        return sb.toString();
    }
}
