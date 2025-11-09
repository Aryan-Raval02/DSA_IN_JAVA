public class Problem2243 
{
    public static String digitSum(String s, int k) 
    {
        if(s.length() <= k)
            return s;

        StringBuilder sb = new StringBuilder();

            for(int i=0; i<s.length(); i+=k)
            {
                int end = Math.min(i+k, s.length());
                String str = s.substring(i, end);

                int sum = 0;
                for(char c : str.toCharArray())
                {
                    sum += c - '0';
                }

                sb.append(sum);
            }

        return digitSum(sb.toString(), k);
    }
    public static void main(String[] args) 
    {
        System.out.println(digitSum("11111222223", 3));
        System.out.println(digitSum("00000000", 3));
    }    
}
