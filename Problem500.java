import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem500 
{
    public static String[] findWords(String[] words) 
    {
        Set<Character> first = new HashSet<>();
        first.add('q');
        first.add('w');
        first.add('e');
        first.add('r');
        first.add('t');
        first.add('y');
        first.add('u');
        first.add('i');
        first.add('o');
        first.add('p');

        Set<Character> second = new HashSet<>();
        second.add('a');
        second.add('s');
        second.add('d');
        second.add('f');
        second.add('g');
        second.add('h');
        second.add('j');
        second.add('k');
        second.add('l');

        Set<Character> third = new HashSet<>();
        third.add('z');
        third.add('x');
        third.add('c');
        third.add('v');
        third.add('b');
        third.add('n');
        third.add('m');

        String[] ans = new String[words.length];
        int i=0;

        for(String s : words)
        {
            if (s == null || s.isEmpty()) continue;
            String small = s.toLowerCase();
            boolean flag = false;

            if(first.contains(small.charAt(0)))
            {
                flag = checkString(small, first);
            }
            else if (second.contains(small.charAt(0))) 
            {
                flag = checkString(small, second);
            }
            else
            {
                flag = checkString(small, third);
            }

            if(flag)
                ans[i++]=s;
        }

        return Arrays.copyOf(ans, i);
    }

    public static boolean checkString(String small, Set<Character> set)
    {
        for(char c : small.toCharArray())
        {
            if(!set.contains(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
    }  
}
