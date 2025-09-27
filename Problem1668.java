public class Problem1668 
{
    public static int maxRepeating(String sequence, String word) 
    {
        int counter = 0;
        int start = sequence.length()-word.length();

        StringBuilder sb = new StringBuilder();
        while(start>=0)
        {
            if(sequence.substring(start, start+word.length()).equals(word))
            {
                sb.append("*");
                start = start - word.length();
            }
            else
            {
                sb.append(sequence.charAt(start));
                start--;
            }
        }

        int res = 0;
        for(char ch : sb.reverse().toString().toCharArray())
        {
            if(ch == '*')
                counter++;
            else
            {
                res = Math.max(counter, res);
                counter = 0;
            }
        }

        res = Math.max(counter, res);

        return res;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }    
}
