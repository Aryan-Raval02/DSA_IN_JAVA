public class Problem1816 
{
    public static String truncateSentence(String s, int k) 
    {
        int count = 0;
        int i=0;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                count++;
            }
            if(count == k)
            {
                break;
            }
        }

        return s.substring(0, i);

        // String[] words = s.split(" ");

        // StringBuilder sb = new StringBuilder();

        // int i=0;
        // for(String str : words)
        // {
        //     if(i==k) break;
        //     sb.append(str+" ");
        //     i++;
        // }

        // return sb.toString().trim();
    }
    public static void main(String[] args) 
    {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }    
}
