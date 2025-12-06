import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Problem3663 {
    public int getLeastFrequentDigit(int n) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        while(n>0)
        {
            int m = n %10;
            map.put(m , map.getOrDefault(m, 0)+1);
            n/=10;
        }

        int minFreq = Integer.MAX_VALUE;
        int value = 1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int digit = entry.getKey();
            int freq = entry.getValue();

            if(freq < minFreq)
            {
                minFreq = freq;
                value = digit;
            }
        }
        return value;
    }
}
