import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem804 {
    public static void main(String[] args) {

    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] mapping = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };

        Set<String> set = new HashSet<>();

        for(int i=0; i<words.length; i++)
        {
            StringBuilder sb = new StringBuilder();
            for(char ch : words[i].toCharArray())
            {
                sb.append(mapping[ch-'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
