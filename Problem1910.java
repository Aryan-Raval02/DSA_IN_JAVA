public class Problem1910 {
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        if(!s.contains(part))
        {
            return s;
        }

        int start = sb.indexOf(part);
        int end = start + part.length();
        sb.delete(start, end);
        return removeOccurrences(sb.toString(), part);

        // StringBuilder sb = new StringBuilder();
        // int m = part.length();

        // for (char c : s.toCharArray()) {
        //     sb.append(c);

        //     if (sb.length() >= m && sb.substring(sb.length() - m).equals(part)) 
        //     {
        //         sb.delete(sb.length() - m, sb.length());
        //     }
        // }

        // return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
}
